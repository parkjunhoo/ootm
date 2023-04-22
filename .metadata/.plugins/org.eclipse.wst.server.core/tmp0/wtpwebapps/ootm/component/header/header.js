class Header extends HTMLElement{
    /**
     * 속성
     * mTextColor   : 헤더의 기본메뉴(?)텍스트 의 색을 지정합니다.
     * smTextColor  : 헤더의 서브메뉴(?마우스올리면 내려오는 메뉴)의 텍스트 색을 지정합니다.
     * bgColor      : 헤더의 기본 배경색을 지정합니당
     * bgHoverColor : 헤더위에 마우스를 올렸을때 내려오는 배경의 색을 지정합니다.
     * 
     * (logo 옵션은 하나만 주면안되고 둘다 지정해야합니당!!)
     * logoDark     : true = 다크로고 , false = 흰색로고
     * logoHoverDark: true = 다크로고 , false = 흰색로고
     */
    constructor(){
        super();
        this._searchBarDiv = null;
   		this._searchBar = null;
   		this._tColor = null;
   		this._bgColor = null;
   		this._drawer = null;
   		this._headerNavTextMenu = null;
   		this._headerNavIconMenu = null;
   		this._headerNavMenuBtn = null;
   		this._headerNav = null;
   		this._isDrawOpen = false;
   		
        this._logoSrc = "/ootm/images/logo.png";
        this._logoDarkSrc = "/ootm/images/logoDark.png";
        
        this._textMenuList = [
            {
                name:"New(10% SALE)",
                subMenu:[
                    {
                        name:"New(10% SALE)",
                        korName:"신상(10% SALE)",
                        highlight:true
                    }
                ]
            },
            {
                name:"Best",
                subMenu:[
                    {
                        name:"Best",
                        korName:"베스트",
                        highlight:true
                    }
                ]
            },
            {
                name:"Outer",
                subMenu:[
                    {
                        name:"Outer",
                        korName:"아우터",
                        highlight:true
                    }
                ]
            },
            {
                name:"Top",
                subMenu:[
                    {
                        name:"Shirt",
                        korName:"셔츠",
                        highlight:false
                    },
                    {
                        name:"Long Sleeve",
                        korName:"긴팔",
                        highlight:true
                    },
                    {
                        name:"Knit",
                        korName:"니트",
                        highlight:false
                    },
                    {
                        name:"Short Sleeve",
                        korName:"반팔",
                        highlight:false
                    }
                ]
            },
            {
                name:"Botton",
                subMenu:[
                    {
                        name:"Jean",
                        korName:"진",
                        highlight:false
                    },
                    {
                        name:"Pants",
                        korName:"팬츠",
                        highlight:true
                    },
                    {
                        name:"Short Guys",
                        korName:"숏 가이즈",
                        highlight:false
                    }
                ]
            },
            {
                name:"Acc",
                subMenu:[
                    {
                        name:"Shoes",
                        korName:"슈즈",
                        highlight:true
                    },
                    {
                        name:"Bag",
                        korName:"가방",
                        highlight:false
                    },
                    {
                        name:"Accessories",
                        korName:"액세서리",
                        highlight:false
                    },
                    {
                        name:"Season off",
                        korName:"시즌오프",
                        highlight:false
                    }
                ]
            },
            {
                name:"Suit",
                subMenu:[
                    {
                        name:"Suit",
                        korName:"수트",
                        highlight:true
                    }
                ]
            },
            {
                name:"SET EVENT",
                subMenu:[
                    {
                        name:"SET EVENT",
                        korName:"세트 이벤트",
                        highlight:true
                    }
                ]
            }
        ];

        this._recommendTags = [
            {
                name:"#9부팬츠",
                link:"/"
            },
            {
                name:"#자체제작",
                link:"/"
            },
            {
                name:"#맨투맨",
                link:"/"
            }
        ];
        
        
        this._recommendTags = [
            {
                name:"#9부팬츠",
                link:"/"
            },
            {
                name:"#자체제작",
                link:"/"
            },
            {
                name:"#맨투맨",
                link:"/"
            }
        ];
    }

    connectedCallback(){
        
        
        // let headLink = document.createElement("link");
        // let head = document.getElementsByTagName("head")[0];
        // headLink.rel = "stylesheet";
        // headLink.type = "text/css";
        // headLink.href = "../component/header/header.css";
        // head.appendChild(headLink);
        
        //<header>
        // <div id="searchBarDiv" style="display: block; overflow: hidden;">
        //         <div class="SearchExitBtn"><span>✖</span></div>     
        //         <div id="searchBar" style="top:0; overflow: hidden;">
        //         <div class="searchLeftDiv">
        //             <h2>검색어 입력 후 엔터</h2>
        //             <div class="searchInnerDiv borderBottom2">
        //                 <h1>#</h1>
        //                 <form id="searchForm" name="searchForm">
        //                     <input type="text" id="headerSearchInput" name="searchProductInput"/>
        //                 </form>
        //             </div>
        //         </div>
        //         <div class="searchRightDiv">
        //             <h2>추천 검색어</h2>
        //             <div class="searchInnerDiv">
        //                 <span>#9부팬츠</span>
        //                 <span>#자체제작</span>
        //                 <span>#맨투맨</span>
        //             </div>
        //         </div>
        //     </div>

        //     <div id="searchBarBG"></div>
        // </div>
        // <div id="headerNav">
        //         </div>
        //         <div id="headerMenuBackground"></div>
        //         <div id="headerNavLogoHolder">
        //             <a href=""><img id="headerLogoImg" src="../resources/images/logo.png"/></a>
        //         </div>
                
        //         <div id="headerNavTextMenu">
        //             <ul class="menuList dropListHeader">
        //                 <li>
        //                     <div>
        //                          <p>
        //                              New(10% Sale)
        //                              <div class="menuListUnderline">
        //                              </div>
        //                          </p>
        //                      </div>
        //                     <ul class="dropList">
        //                         <li><p>New(10% Sale)</p></li>
        //                     </ul>
        //                 </li>
        //             </ul>
        //         </div>

        //         <div id="this._headerNavIconMenu">
        //             <svg xmlns="http://www.w3.org/2000/svg" height="48" viewBox="0 96 960 960" width="48"><path d="M479.956 563q-76.826 0-124.391-48.065Q308 466.87 308 390.704q0-76.167 47.406-123.935Q402.812 219 479.637 219q76.826 0 125.094 47.656Q653 314.312 653 391.204q0 75.666-48.109 123.731Q556.781 563 479.956 563ZM138 926V810.205q0-43.979 22.828-76.61T220 684q68-32 131.72-47 63.721-15 127.772-15 65.97 0 128.739 16 62.769 16 130.69 46.194 37.911 15.778 60.995 48.556Q823 765.528 823 809.945V926H138Zm91-91h502v-21q0-15.353-9.7-30.063Q711.6 769.228 697 763q-60-29-109.995-39-49.996-10-108-10Q423 714 372 724.5q-51 10.5-108.571 38.344-15.679 6.584-25.054 20.976Q229 798.212 229 814v21Zm250.796-363Q514 472 537.5 448.654t23.5-57.619q0-34.685-23.296-58.36Q514.407 309 480.204 309 446 309 422.5 332.721T399 390.54q0 34.51 23.296 57.985Q445.593 472 479.796 472Zm.204-81Zm0 444Z"/></svg>
        //             <svg xmlns="http://www.w3.org/2000/svg" height="48" viewBox="0 96 960 960" width="48"><path d="M190 1016q-37.175 0-64.088-27.206Q99 961.588 99 924V414q0-37.588 26.912-64.794Q152.825 322 190 322h92q0-81 55.315-139 55.316-58 137.31-58 81.995 0 142.685 57.888Q678 240.775 678 322h92q37.588 0 64.794 27.206Q862 376.412 862 414v510q0 37.588-27.206 64.794Q807.588 1016 770 1016H190Zm0-92h580V414H190v510Zm289.625-262q81.995 0 142.685-59.953Q683 542.095 683 459h-91q0 48-32.534 80-32.535 32-79.584 32-47.049 0-79.465-32.5Q368 506 368 459h-91q0 83.34 60.315 143.17Q397.631 662 479.625 662ZM373 322h214q0-47-30.034-76-30.035-29-77.084-29-47.049 0-76.965 29.333Q373 275.667 373 322ZM190 924V414v510Z"/></svg>
        //             <svg xmlns="http://www.w3.org/2000/svg" height="48" viewBox="0 96 960 960" width="48"><path d="M794 960 525.787 692Q496 714.923 457.541 727.962 419.082 741 373.438 741q-115.311 0-193.875-78.703Q101 583.594 101 470.797T179.703 279.5q78.703-78.5 191.5-78.5T562.5 279.644Q641 358.288 641 471.15q0 45.85-13 83.35-13 37.5-38 71.5l270 268-66 66ZM371.441 650q75.985 0 127.272-51.542Q550 546.917 550 471.412q0-75.505-51.346-127.459Q447.309 292 371.529 292q-76.612 0-128.071 51.953Q192 395.907 192 471.412t51.311 127.046Q294.623 650 371.441 650Z"/></svg>
        //         </div>

        //         <div id="this._headerNavMenuBtn">
        //             <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 96 960 960" width="48"><path d="M105 841v-91h750v91H105Zm0-219v-91h750v91H105Zm0-220v-92h750v92H105Z"/></svg>
        //         </div>
        //     </div>
        //</header>

        let header = document.createElement("header");
        if(this.hasAttribute("logoDark") && this.hasAttribute("logoHoverDark")){
            header.addEventListener("mouseover", ()=>{
                if(window.innerWidth< 1300) return;
                if(this.getAttribute("logoHoverDark")=="true"){
                    headerLogoImg.src = this._logoDarkSrc;
                }else{
                    headerLogoImg.src = this._logoSrc;
                }
            });
            header.addEventListener("mouseleave", ()=>{
                if(window.innerWidth< 1300) return;
                if(this.getAttribute("logoDark")=="true"){
                    headerLogoImg.src = this._logoDarkSrc;
                }else{
                    headerLogoImg.src = this._logoSrc;
                }
            });
        }
        
        this.appendChild(header);

            this._searchBarDiv = document.createElement("div");
            this._searchBarDiv.id = "searchBarDiv";

            let SearchExitBtn = document.createElement("div");
            SearchExitBtn.classList.add("SearchExitBtn");
            let exitSpan = document.createElement("span");
            exitSpan.textContent = "✖";
            exitSpan.addEventListener("click",() => {
                this.closeSearchBar();
            })
            SearchExitBtn.appendChild(exitSpan);

            this._searchBar = document.createElement("div");
            this._searchBar.id = "searchBar"
            

            let searchBarBG = document.createElement("div");
            searchBarBG.id = "searchBarBG";
            searchBarBG.addEventListener("click", () => {
                this.closeSearchBar();
            });

            this._searchBarDiv.appendChild(this._searchBar);
            this._searchBarDiv.appendChild(SearchExitBtn);
            this._searchBarDiv.appendChild(searchBarBG);
            header.appendChild(this._searchBarDiv);

                let searchLeftDiv = document.createElement("div");
                searchLeftDiv.classList.add("searchLeftDiv");
                this._searchBar.appendChild(searchLeftDiv);
                    let h2l = document.createElement("h2");
                    h2l.textContent = "검색어 입력 후 엔터";
                    searchLeftDiv.appendChild(h2l);
                    let searchInnerDiv = document.createElement("div");
                    searchInnerDiv.classList.add("searchInnerDiv");
                    searchInnerDiv.classList.add("borderBottom2");
                    searchLeftDiv.appendChild(searchInnerDiv);
                        let h1s = document.createElement("h1");
                        h1s.textContent = "#";
                        searchInnerDiv.appendChild(h1s);

                        let searchForm = document.createElement("form");
                        searchForm.id = "searchForm";
                        searchForm.name = "searchForm";
                        searchForm.action = "/ootm/jsp/search.jsp";
                        searchInnerDiv.appendChild(searchForm);
                            let headerSearchInput = document.createElement("input");
                            headerSearchInput.id = "headerSearchInput";
                            headerSearchInput.type = "text";
                            headerSearchInput.name = "searchPageInput";
                            searchForm.appendChild(headerSearchInput);


                let searchRightDiv = document.createElement("div");
                searchRightDiv.classList.add("searchRightDiv");
                this._searchBar.appendChild(searchRightDiv);
                    let h2r = document.createElement("h2");
                    h2r.textContent = "추천 검색어";
                    searchRightDiv.appendChild(h2r);

                    let searchInnerDiv2 = document.createElement("div");
                    searchInnerDiv2.classList.add("searchInnerDiv");
                    searchRightDiv.appendChild(searchInnerDiv2);
                        for(let i=0; i<3; i++){
                            let span = document.createElement("span");
                            span.textContent = this._recommendTags[i].name;
                            searchInnerDiv2.appendChild(span);
                        }
                    



            this._headerNav = document.createElement("div");
                this._headerNav.id = "headerNav";
                if(this.hasAttribute("bgColor")){
                    headerNav.style.backgroundColor = this.getAttribute("bgColor");
                }
                header.appendChild(this._headerNav);
                

                let headerMenuBackground = document.createElement("div");
                headerMenuBackground.id = "headerMenuBackground";
                headerNav.appendChild(headerMenuBackground);
                if(this.hasAttribute("bgHoverColor")){
                    headerMenuBackground.style.backgroundColor = this.getAttribute("bgHoverColor");
                }

                let headerNavLogoHolder = document.createElement("div");
                headerNavLogoHolder.id = "headerNavLogoHolder";
                header.appendChild(headerNavLogoHolder);
                    let logoA = document.createElement("a");
                    logoA.href = "/ootm/jsp/index.jsp";
                    headerNavLogoHolder.appendChild(logoA);
                        let headerLogoImg = document.createElement("img");
                        headerLogoImg.id="headerLogoImg";

                        let logoDark = this.hasAttribute("logoDark");
                        let logoSrc = "";
                        if(logoDark){
                            logoSrc = this.getAttribute("logoDark")=="true" ? this._logoDarkSrc : this._logoSrc
                        }else{
                            logoSrc = this._logoSrc;
                        }
                        headerLogoImg.src = logoSrc;

                        logoA.appendChild(headerLogoImg);
                this._headerNav.appendChild(headerNavLogoHolder);

                this._headerNavTextMenu = document.createElement("div");
                this._headerNavTextMenu.id = "headerNavTextMenu";
                header.appendChild(this._headerNavTextMenu);
                    let textMenuUl = document.createElement("ul");
                    textMenuUl.classList.add("menuList");
                    textMenuUl.classList.add("dropListHeader");
                    this._headerNavTextMenu.appendChild(textMenuUl);

                    let textMenuLength = this._textMenuList.length;
                        for(let i =0; i<textMenuLength; i++){
                            let li = document.createElement("li");
                            textMenuUl.appendChild(li);

                            let nameDiv = document.createElement("div");
                            let nameP = document.createElement("p");
                            nameP.innerHTML = this._textMenuList[i].name;
                                let menuListUnderline = document.createElement("div");
                                menuListUnderline.classList.add("menuListUnderline");
                                if(this.hasAttribute("mTextColor")){
                                    nameP.style.color= this.getAttribute("mTextColor");
                                }
                                nameP.appendChild(menuListUnderline);
                            nameDiv.appendChild(nameP);
                            li.appendChild(nameDiv);
                            
                            let dropList = document.createElement("ul");
                            dropList.classList.add("dropList");
                            li.appendChild(dropList);

                            let subMenuLength = this._textMenuList[i].subMenu.length;
                            for(let o=0; o<subMenuLength; o++){
                                let li = document.createElement("li");
                                let p = document.createElement("p");
                                li.appendChild(p);
                                p.textContent = this._textMenuList[i].subMenu[o].name;
                                li.addEventListener("mouseenter", () =>{
                                    p.textContent = this._textMenuList[i].subMenu[o].korName;
                                });
                                li.addEventListener("mouseleave", () =>{
                                    p.textContent = this._textMenuList[i].subMenu[o].name;
                                });
                                if(this._textMenuList[i].subMenu[o].highlight)
                                {
                                    p.style.color= "red";
                                }else if(this.hasAttribute("smTextColor")){
                                    p.style.color= this.getAttribute("smTextColor");
                                }
                                dropList.appendChild(li);
                            }
                        }
                this._headerNav.appendChild(this._headerNavTextMenu);



                this._headerNavIconMenu = document.createElement("div");
                this._headerNavIconMenu.id = "headerNavIconMenu";

                    let memberSVG = document.createElementNS("http://www.w3.org/2000/svg","svg");
                    memberSVG.setAttribute("width","48");
                    memberSVG.setAttribute("height","48");
                    memberSVG.setAttribute("viewBox","0 96 960 960");
                    let memberSVGPath = document.createElementNS("http://www.w3.org/2000/svg","path");
                    memberSVGPath.setAttribute("d","M479.956 563q-76.826 0-124.391-48.065Q308 466.87 308 390.704q0-76.167 47.406-123.935Q402.812 219 479.637 219q76.826 0 125.094 47.656Q653 314.312 653 391.204q0 75.666-48.109 123.731Q556.781 563 479.956 563ZM138 926V810.205q0-43.979 22.828-76.61T220 684q68-32 131.72-47 63.721-15 127.772-15 65.97 0 128.739 16 62.769 16 130.69 46.194 37.911 15.778 60.995 48.556Q823 765.528 823 809.945V926H138Zm91-91h502v-21q0-15.353-9.7-30.063Q711.6 769.228 697 763q-60-29-109.995-39-49.996-10-108-10Q423 714 372 724.5q-51 10.5-108.571 38.344-15.679 6.584-25.054 20.976Q229 798.212 229 814v21Zm250.796-363Q514 472 537.5 448.654t23.5-57.619q0-34.685-23.296-58.36Q514.407 309 480.204 309 446 309 422.5 332.721T399 390.54q0 34.51 23.296 57.985Q445.593 472 479.796 472Zm.204-81Zm0 444Z");
                    memberSVG.appendChild(memberSVGPath);
                    this._headerNavIconMenu.appendChild(memberSVG);
                    
                    let mallSVG = document.createElementNS("http://www.w3.org/2000/svg","svg");
                    mallSVG.setAttribute("width","48");
                    mallSVG.setAttribute("height","48");
                    mallSVG.setAttribute("viewBox","0 96 960 960");
                    let mallSVGPath = document.createElementNS("http://www.w3.org/2000/svg","path");
                    mallSVGPath.setAttribute("d","M190 1016q-37.175 0-64.088-27.206Q99 961.588 99 924V414q0-37.588 26.912-64.794Q152.825 322 190 322h92q0-81 55.315-139 55.316-58 137.31-58 81.995 0 142.685 57.888Q678 240.775 678 322h92q37.588 0 64.794 27.206Q862 376.412 862 414v510q0 37.588-27.206 64.794Q807.588 1016 770 1016H190Zm0-92h580V414H190v510Zm289.625-262q81.995 0 142.685-59.953Q683 542.095 683 459h-91q0 48-32.534 80-32.535 32-79.584 32-47.049 0-79.465-32.5Q368 506 368 459h-91q0 83.34 60.315 143.17Q397.631 662 479.625 662ZM373 322h214q0-47-30.034-76-30.035-29-77.084-29-47.049 0-76.965 29.333Q373 275.667 373 322ZM190 924V414v510Z");
                    mallSVG.appendChild(mallSVGPath);
                    mallSVG.addEventListener("click", ()=>{
						location.href = "/ootm/jsp/basket.jsp";
					});
                    this._headerNavIconMenu.appendChild(mallSVG);

                    let searchSVG = document.createElementNS("http://www.w3.org/2000/svg","svg");
                        searchSVG.addEventListener("click" , ()=>{
                            if(this.hasAttribute("searchBtnAction")){
                                eval(this.getAttribute("searchBtnAction"));
                            }else{
                                this.openSearchBar();
                            }
                        });
                    
                    searchSVG.setAttribute("width","48");
                    searchSVG.setAttribute("height","48");
                    searchSVG.setAttribute("viewBox","0 96 960 960");
                    let searchSVGPath = document.createElementNS("http://www.w3.org/2000/svg","path");
                    searchSVGPath.setAttribute("d","M794 960 525.787 692Q496 714.923 457.541 727.962 419.082 741 373.438 741q-115.311 0-193.875-78.703Q101 583.594 101 470.797T179.703 279.5q78.703-78.5 191.5-78.5T562.5 279.644Q641 358.288 641 471.15q0 45.85-13 83.35-13 37.5-38 71.5l270 268-66 66ZM371.441 650q75.985 0 127.272-51.542Q550 546.917 550 471.412q0-75.505-51.346-127.459Q447.309 292 371.529 292q-76.612 0-128.071 51.953Q192 395.907 192 471.412t51.311 127.046Q294.623 650 371.441 650Z");
                    searchSVG.appendChild(searchSVGPath);
                    this._headerNavIconMenu.appendChild(searchSVG);
                    if(this.hasAttribute("mTextColor")){
                        memberSVG.style.fill= this.getAttribute("mTextColor");
                        mallSVG.style.fill= this.getAttribute("mTextColor");
                        searchSVG.style.fill= this.getAttribute("mTextColor");
                    }

                this._headerNav.appendChild(this._headerNavIconMenu);

                this._headerNavMenuBtn = document.createElement("div");
                this._headerNavMenuBtn.id = "headerNavMenuBtn";
                    let menuBtnIcon1 = document.createElement("div");
                    menuBtnIcon1.classList.add("headerMenuBtnIcon");
                    let menuBtnIcon2 = document.createElement("div");
                    menuBtnIcon2.classList.add("headerMenuBtnIcon");

                    this._headerNavMenuBtn.appendChild(menuBtnIcon1);
                    this._headerNavMenuBtn.appendChild(menuBtnIcon2);
               		this._headerNavMenuBtn.addEventListener("click", ()=>{
						if(this._isDrawOpen){
							this.closeDrawer();
						}else{
							this.openDrawer();
						}
					});
                    // let menuSVG = document.createElementNS("http://www.w3.org/2000/svg","svg");
                    // menuSVG.setAttribute("width","48");
                    // menuSVG.setAttribute("height","48");
                    // menuSVG.setAttribute("viewBox","0 96 960 960");
                    // let menuSVGPath = document.createElementNS("http://www.w3.org/2000/svg","path");
                    // menuSVGPath.setAttribute("d","M105 841v-91h750v91H105Zm0-219v-91h750v91H105Zm0-220v-92h750v92H105Z");
                    // menuSVG.appendChild(menuSVGPath);
                    // this._headerNavMenuBtn.appendChild(menuSVG);
                    // if(this.hasAttribute("mTextColor")){
                    //     menuSVG.style.fill= this.getAttribute("mTextColor");
                    // }
                this._headerNav.appendChild(this._headerNavMenuBtn);
                
           this._drawer = document.createElement("div");
           this._drawer.id = "drawer";
           header.appendChild(this._drawer);
           
           
           
    }
    
    openSearchBar(){
        this._searchBarDiv.style.display = "block";
        this._searchBar.classList.remove("closeSearchBar");
        this._searchBar.classList.add("openSearchBar");
        
    }
    closeSearchBar(){
        this._searchBar.classList.remove("openSearchBar");
        this._searchBar.classList.add("closeSearchBar");
        setTimeout(() => {
            this._searchBarDiv.style.display = "none";
            this._searchBar.classList.remove("closeSearchBar");
        }, 500);
    }
    
    openDrawer(){
		if(this._isDrawOpen) return;
		this._isDrawOpen = true;
		this._drawer.classList.add("openDrawerAnim");
		document.body.style.overflowY = "hidden";
       	this._drawer.appendChild(this._headerNavIconMenu);
       	this._drawer.appendChild(this._headerNavMenuBtn);
       	this._drawer.appendChild(this._headerNavTextMenu);
	}
	closeDrawer(){
		if(!this._isDrawOpen) return;
		this._isDrawOpen = false;
		this._drawer.classList.remove("openDrawerAnim");
		document.body.style.overflowY = "auto";
		this._headerNav.appendChild(this._headerNavTextMenu);
		this._headerNav.appendChild(this._headerNavIconMenu);
		this._headerNav.appendChild(this._headerNavMenuBtn);
	}

    
}

customElements.define("header-component", Header);