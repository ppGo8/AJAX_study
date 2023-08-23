function jQuery(selector){
    if (typeof  selector === "string"){
        if (selector.charAt(0)==="#"){
            domObj = document.getElementById(selector.substring(1))
            return new jQuery()
        }
    }
    if (typeof selector ==="function"){
        window.onload = selector
    }
    this.html = function(htmlstr) {
        domObj.innerHTML = htmlstr
    }
    this.click = function (fun){
        domObj.onclick = fun
        // domObj.addEventListener("click",fun)
    }
    this.val = function (context){
        if (context){
            domObj.value = context
        }else {
            return domObj.value
        }
    }
}

$ = jQuery