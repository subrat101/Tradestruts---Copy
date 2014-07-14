(function($) { //create closure

$.fn.menu_toggle_adder = function(options){

	var defaults = {
	
	animate_toggle: 'yes',
	highlight_selected_link: 'yes',
	toggle: 'images/toggle.gif',
	toggled: 'images/toggled.gif',
	toggle_selected: 'images/toggle_selected.gif',
	toggled_selected: 'images/toggled_selected.gif'
	
	};
	
// var opts = $.extend({}, $.fn.menu_toggle_adder.defaults, options);

var opts = $.extend(defaults, options);
	
	/*-- add class of menu_selected to the link that matches the page being viewed --*/
	
	if ( defaults.highlight_selected_link == 'yes' ) {
	
	var page_name_string = location.pathname.toString();
	
	var page_name_array = page_name_string.split('/');
	var page_name = page_name_array[page_name_array.length - 1];
	
	/*-- kludge for ie6 --*/
	
if( jQuery.browser.msie && (jQuery.browser.version < 7) ) 

 {
	var page_name_array = page_name_string.split('\\');
	var page_name = page_name_array[page_name_array.length - 1];
	}
	
	if (page_name) {
		$('#menu a[@href$="' + page_name + '"]').addClass('menu_selected');
	}
	
	/*-- if the link is second level, add class of menu_selected to the parent link --*/
	
	$("#menu li ul li a.menu_selected").parent("li").parent("ul").parent("li").children().eq(0).addClass("menu_selected");
	}
	/*-- show ul beneath the link that matches the page being viewed --*/

	$(".menu_selected").parent("li").children("ul").show();
	
	/*-- if a ul has a nested ul, then prepend a toggle image to the a. --*/
	
	$("#menu li a").parent('li:has(ul)').each(function(){
	
		var $this = $(this);
		
		$this.children("a").eq("0").before("<img class='toggler'>");
		$(".toggler").attr({
			src: defaults.toggle
		});
	});
	
	/*-- Find the selected link with the image 'toggle.gif' and change it to 'toggled.gif' --*/
	
	$("#menu li a").parent('li:has(ul)').each(function(){
	
		var $this = $(this);
		
		$this.children("a.menu_selected").eq("0").prev('.toggler').attr({
			src: defaults.toggled_selected
		});
	});
	
	/*--- Add toggle functionality to toggle images --*/
	
	/*--- if toggle_selected = yes --*/
	
	$("#menu li img").each(function(){
	
		var $this = $(this);
		
		var toggler_src = $this.attr("src");
		
		if (toggler_src == defaults.toggled_selected && defaults.animate_toggle == "yes") {
		
			$this.toggle(function(){
				$this.nextAll("ul").slideUp("fast");
				$this.attr("src", defaults.toggle_selected);
			}, function(){
				$this.nextAll("ul").slideDown("fast");
				$this.attr("src", defaults.toggled_selected);
			});
		}
		
		else 
			if (toggler_src == defaults.toggle && defaults.animate_toggle == "yes") {
			
				$this.toggle(function(){
					$this.nextAll("ul").slideDown("fast");
					$this.attr("src", defaults.toggled);
				}, function(){
					$this.nextAll("ul").slideUp("fast");
					$this.attr("src", defaults.toggle);
				});
			}
			
		/*--- if toggle_selected = no --*/
			
		else if (toggler_src == defaults.toggled_selected && defaults.animate_toggle == "no") {
		
			$this.toggle(function(){
				$this.nextAll("ul").hide();
				$this.attr("src", defaults.toggle_selected);
			}, function(){
				$this.nextAll("ul").show();
				$this.attr("src", defaults.toggled_selected);
			});
		}
		
		else 
			if (toggler_src == defaults.toggle && defaults.animate_toggle == "no") {
			
				$this.toggle(function(){
					$this.nextAll("ul").show();
					$this.attr("src", defaults.toggled);
				}, function(){
					$this.nextAll("ul").hide();
					$this.attr("src", defaults.toggle);
				});	
			}
	});
	
	/*-- Add selected class to selected parent li's --*/
	
	$("#menu li:has(a.menu_selected)").addClass('menu_selected_holder');
	$("#menu li ul li:has(a.menu_selected)").removeClass('menu_selected_holder');
	
	/*-- fix ie6. Remove bg color change on hover for links --*/
	
	$("#menu li a:not('.menu_selected')").hover(function(){
		$(this).css("background-color", "transparent");
	}, function(){
		$(this).css("background-color", "transparent");
	});
}

//end of closure
})(jQuery);