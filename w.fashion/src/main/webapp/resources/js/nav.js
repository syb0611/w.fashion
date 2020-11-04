const body = $("body"); 
const m_nav = $(".mobile-nav");
const m_dropdown = $(".mobile-nav .drop-down");

function setEvent() {
	
	/***** mobile *****/
	
	$(".header-nav-toggle").on("click", function() {
		$(m_nav).addClass("active");
		$(body).addClass("mobile-nav-active");
	});
	
	$(m_dropdown).on("click", function() {
		if ($(this).hasClass("open")) {
			$(this).removeClass("open");
		} else {
			$(m_dropdown).removeClass("open");
			$(this).addClass("open");
		}
	});
	
	$(".mobile-nav .close-btn").on("click", function() {
		$(body).removeClass("mobile-nav-active");
		$(m_dropdown).removeClass("open");
		$(m_nav).removeClass("active");
	});
}

function init() {
	setEvent();
}

init();