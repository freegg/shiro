/*!
 * Datepicker for Bootstrap v1.7.0-dev (https://github.com/eternicode/bootstrap-datepicker)
 *
 * Copyright 2012 Stefan Petre
 * Improvements by Andrew Rowls
 * Licensed under the Apache License v2.0 (http://www.apache.org/licenses/LICENSE-2.0)
 */(function(factory){
    if (typeof define === "function" && define.amd) {
        define(["jquery"], factory);
    } else if (typeof exports === 'object') {
        factory(require('jquery'));
    } else {
        factory(jQuery);
    }
    console.log("cccccccccccccccccccccccccccccccccccc");
}(function($, undefined){
	// Picker object
	var Date = function(element, options){
		console.log(element+"bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
		console.log($(element));
		$(element).data('datepicker', this);
		this._process_options(options);
		this.dates = new DateArray();
		this.viewDate = this.o.defaultViewDate;
		this.focusDate = null;
		this.element = $(element);
		this.hasInput = this.component && this.inputField.length;
	};

}));
