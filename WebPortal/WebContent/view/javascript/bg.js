

    // this will run this function as soon as the page is loaded...
    $(function(){

        // bind the resize event to the window...
        // this will call the 'centerMyContent' function whenever the
        // window is resized...
        jQuery(window).bind('resize', centerMyContent);

        // call the 'centerMyContent' function on the first page load...
        centerMyContent();

    });

    // the actual centring function...
    function centerMyContent(){

        // get the body and container elements...
        var container = jQuery('#container');
        var body = jQuery('body');

        // work out the top position for the container...
        var top = (body.height() / 2) - (container.height() / 2);

        // set the container's top position...
        container.css('top', top + 'px');

    }

