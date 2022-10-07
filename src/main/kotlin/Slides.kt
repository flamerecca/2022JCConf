import com.kslides.*
import com.pambrose.srcref.Api.srcrefUrl
import kotlinx.html.*

fun main() {

    val slides = "src/main/kotlin/Slides.kt"

    fun srcrefLink(token: String, escapeHtml4: Boolean = false) =
        srcrefUrl(
            account = "kslides",
            repo = "kslides-template",
            path = slides,
            beginRegex = "\\s+// $token begin",
            beginOffset = 1,
            endRegex = "\\s+// $token end",
            endOffset = -1,
            escapeHtml4 = escapeHtml4,
        )

    kslides {

        output {
            // Write the presentation's html files to /docs for Github Pages or netlify.com
            enableFileSystem = true

            // Run locally or on Heroku
            enableHttp = true
        }

        // CSS values assigned here are applied to all the presentations
        css +=
            """
            #githubCorner path { 
              fill: #258BD2; 
            }
            """

        presentationConfig {
            history = true
            transition = Transition.SLIDE
            transitionSpeed = Speed.SLOW

            topLeftHref = "https://github.com/flamerecca/2022JCConf/"
            topLeftTitle = "View presentation source on Github"

            topRightHref = "/"  // Assign to "" to turn this off
            topRightTitle = "首頁"
            topRightText = "🏠"

            enableMenu = true
            theme = PresentationTheme.MOON
            slideNumber = "c/t"

            menuConfig {
                numbers = true
            }

            copyCodeConfig {
                timeout = 2000
                copy = "Copy"
                copied = "Copied!"
            }

            slideConfig {
                // Assign slide config defaults for all presentations
                // backgroundColor = "blue"
            }
        }

        presentation {

            css +=
                """
                #ghsrc {
                  font-size: 30px;
                  text-decoration: underline;
                }  
                img[alt=revealjs-image] { 
                  width: 1000px; 
                }
                """

            presentationConfig {
                transition = Transition.CONCAVE

                slideConfig {
                    // Assign slide config defaults for all slides in this presentation
                    //backgroundColor = "red"
                }
            }

            markdownSlide {
                slideConfig {
                    transition = Transition.ZOOM
                }

                content {
                    """
                    ## 演講的投影片還沒做，就用 Kotlin 做一個吧
                    ### JCConf 2022 
                    """
                }
            }
            verticalSlides {
                markdownSlide {
                    content {
                        """
                        ## 故事是這樣的
                        """
                    }
                }
                markdownSlide {
                    content {
                        """
                        ## 在 COSCUP 的時候
                        """
                    }
                }
                markdownSlide {
                    content {
                        """
                        ![duke](https://i.imgur.com/1xZyc8P.png)
                        
                        ：要不要來講一場
                        """
                    }
                }
                markdownSlide {
                    content {
                        """
                        ## ：我投影片都還沒做 要講什麼
                        """
                    }
                }
                markdownSlide {
                    content {
                        """
                        ## ：不然我用 Kotlin 寫投影片好了
                        """
                    }
                }
                markdownSlide {
                    content {
                        """
                        ![duke](https://i.imgur.com/1xZyc8P.png)
                        
                        ：蛤
                        """
                    }
                }
                markdownSlide {
                    content {
                        """
                        ![clam](https://i.imgur.com/FXevu7K.jpeg)
                        
                        ：蛤
                        """
                    }
                }
                markdownSlide {
                    content {
                        """
                        # 虫合
                        """
                    }
                }
                markdownSlide {
                    content {
                        """
                        所以我就在這邊了
                        """
                    }
                }
            }
            markdownSlide {
                content {
                    """
                    ## Recca Chao
                    - 2019 年開始接觸 Kotlin ${fragment(Effect.FADE_LEFT)}
                    - JCConf Taiwan 2020 ${fragment(Effect.FADE_LEFT)}
                        - Kotlin coroutine 簡介 ${fragment(Effect.FADE_LEFT)}
                    - 2021 年接手 Taiwan Kotlin User Group 管理 ${fragment(Effect.FADE_LEFT)}
                    - 2021 Kotlin Meetup #2 ${fragment(Effect.FADE_LEFT)}
                        - Ktor 初探！ ${fragment(Effect.FADE_LEFT)}
                    - MOPCON 2021 ${fragment(Effect.FADE_LEFT)}
                        - Kotlin 的自動測試怎麼做？ ${fragment(Effect.FADE_LEFT)}
                    - 2021 Kotlin 中文開發者大會 Online ${fragment(Effect.FADE_LEFT)}
                    """
                }
            }

            verticalSlides {
                markdownSlide {
                    content {
                        """
                        ## 這投影片怎麼是用 Reveal.js 做的
                        """
                    }
                }

                markdownSlide {
                    content {
                        """
                        ## 什麼時候開始用 Kotlin 做投影片呢？
                        """
                    }
                }

                markdownSlide {
                    // Image size is controlled by css above
                    content {
                        """
                        ![jojo](https://i.imgur.com/W6zFq9u.jpeg)
                        """
                    }
                }

                markdownSlide {
                    content {
                        """            
                        ## 投影片程式碼    
                        ```kotlin []
                        markdownSlide {
                            slideConfig {
                                transition = Transition.ZOOM
                            }
            
                            content {
                                ""${'"'}
                                ## 演講的投影片還沒做，就用 Kotlin 做一個吧
                                ### JCConf 2022 
                                ""${'"'}
                            }
                        }
                        ```
                        """
                    }
                }
                markdownSlide {
                    content {
                        """
                        # 投影片已經是用 Kotlin 寫的了
                        """
                    }
                }
            }
            verticalSlides {
                markdownSlide {
                    content {
                        """
                        ## 這是怎麼一回事呢？
                        """
                    }
                }

                markdownSlide {
                    content {
                        """
                        我們知道
                        
                        Kotlin 可以編譯成 Java Bytecode
                        """
                    }
                }

                markdownSlide {
                    content {
                        """
                        但是
                        
                        Kotlin 也可以編譯成 JavaScript
                        """
                    }
                }

                markdownSlide {
                    content {
                        """
                            [https://github.com/kslides/kslides/](https://github.com/kslides/kslides/)
                             
                            ![](https://camo.githubusercontent.com/b73931a5a272fb8261f0faeb1a6ba190f38c12711b7eecbdfb01d808343e742c/68747470733a2f2f6b736c696465732e6769746875622e696f2f6b736c696465732f696d616765732f6b736c696465732d73637265656e73686f742e706e67)
                        """
                    }
                }

                markdownSlide {
                    content {
                        """            
                            所以說
                            
                            這整份投影片
                            
                            就是用 Kotlin 做出來的
                            
                            ![Kotlin](data:image/jpeg;base64,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)
                        """
                    }
                }
                markdownSlide {
                    content {
                        """            
                            然後再編譯成
                            
                            ![JavaScript](https://img.alicdn.com/imgextra/i3/920047786/TB2lwkBsrVkpuFjSspcXXbSMVXa_!!920047786.png)
                        """
                    }
                }
                markdownSlide {
                    content {
                        """            
                            運行在
                            
                            ![Reveal.js](https://camo.githubusercontent.com/5327c3e6d8349607bc84c60102bee78e7ee32d2b1861f28445560df9eeb79492/68747470733a2f2f68616b696d2d7374617469632e73332e616d617a6f6e6177732e636f6d2f72657665616c2d6a732f6c6f676f2f76312f72657665616c2d626c61636b2d746578742d737469636b65722e706e67)
                        """
                    }
                }
                markdownSlide {
                    content {
                        """            
                            最後用 Ktor 處理伺服器
                            
                            ![Ktor](https://blog.jetbrains.com/wp-content/uploads/2018/11/kotlin-Ktor.png)
                        """
                    }
                }
                markdownSlide {
                    content {
                        """            
                           ![explode](https://thumbs.gfycat.com/NaughtyFriendlyAndeancondor-size_restricted.gif)
                        """
                    }
                }
            }
            markdownSlide {
                content {
                    """
                    ## 我們來看一些 🌰
                    """
                }
            }
            verticalSlides {
                markdownSlide {
                    content {
                        """
                        ## markdownSlide
                        
                        用 Markdown 的格式撰寫投影片
                        """
                    }
                }

                markdownSlide {
                    content {
                        """
                        ## markdownSlide
                        ```kotlin []
                        markdownSlide {
                            content {
                                ""${'"'}
                                ## markdownSlide
                                
                                用 Markdown 的格式撰寫投影片
                                ""${'"'}
                            }
                        }
                        ```
                        """
                    }
                }

                markdownSlide {
                    content {
                        """
                        ## markdownSlide
                        
                        也可以加入一些動畫效果
                        """
                    }
                }

                markdownSlide {
                    content {
                        """
                        ## markdownSlide
                        ```kotlin []
                        markdownSlide {
                            content {
                                ""${'"'}
                                ## Recca Chao
                                - 2019 年開始接觸 Kotlin ${'$'}{fragment(Effect.FADE_LEFT)}
                                - JCConf Taiwan 2020 ${'$'}{fragment(Effect.FADE_LEFT)}
                                    - Kotlin coroutine 簡介 ${'$'}{fragment(Effect.FADE_LEFT)}
                                ""${'"'}
                            }
                        }
                        ```
                        """
                    }
                }
            }

            verticalSlides {
                // image begin
                markdownSlide {
                    // Image size is controlled by css above
                    content {
                        """
                        ## markdownSlide 也可以插入圖片 
                           
                        ![revealjs-image](images/revealjs.png)
                        """
                    }
                }
                // image end

                markdownSlide {
                    content {
                        """            
                        ## 投影片程式碼寫法   
                        ```kotlin []
                        ${include(slides, beginToken = "image begin", endToken = "image end")}
                        ```
                        """
                    }
                }
            }

            verticalSlides {
                dslSlide {
                    content {
                        h2 { +"DSL 投影片 🐦" }
                        p { +"用 DSL 語法撰寫投影片" }
                    }
                }
                dslSlide {
                    content {
                        h2 { +"什麼是 DSL" }
                        b { +"領域特定語言" }
                        p { +"用 Kotlin 定義的語法" }
                        p { +"在特定領域做特定的事情" }
                    }
                }
                dslSlide {
                    content {
                        h2 { +"什麼是 DSL" }
                        codeSnippet { +"""
                            dslSlide {
                                content {
                                    h2 { +"什麼是 DSL" }
                                    b { +"領域特定語言" }
                                    p { +"用 Kotlin 定義的語法" }
                                    p { +"在特定領域做特定的事情" }
                                }
                            }
                        """.trimIndent() }
                    }
                }
            }


            verticalSlides {
                // code1 begin
                markdownSlide {
                    val src = "kslides-examples/src/main/kotlin/content/HelloWorldK.kt"
                    content {
                        """
                        ## 包含程式碼區塊的 markdownSlide 
                        ```kotlin [1,5|2,4|3]
                        ${include(githubRawUrl("kslides", "kslides", src), "[3-7]")}
                        ```
                        """
                    }
                }
                // code1 end

                markdownSlide {
                    content {
                        """            
                        ## 投影片程式碼寫法    
                        ```kotlin []
                        ${include(slides, beginToken = "code1 begin", endToken = "code1 end")}
                        ```
                        """
                    }
                }
            }

            verticalSlides {
                // code2 begin
                dslSlide {
                    val src = "kslides-examples/src/main/kotlin/content/HelloWorldK.kt"
                    val url = githubRawUrl("kslides", "kslides", src)
                    content {
                        h2 { +"包含程式碼區塊的 dslSlide" }
                        // Display lines 3-7 of the url content and highlight lines 1 and 5, 2 and 4, and finally 3
                        codeSnippet {
                            language = "kotlin"
                            highlightPattern = "[1,5|2,4|3]"
                            +include(url, "[3-7]")
                        }
                    }
                }
                // code2 end

                dslSlide {
                    content {
                        h2 { +"投影片程式碼寫法" }
                        codeSnippet {
                            language = "kotlin"
                            +include(slides, beginToken = "code2 begin", endToken = "code2 end")
                        }
                    }
                }
            }

            verticalSlides {
                // code3 begin
                for (lines in "[8-12|3-12|2-13|]".toLinePatterns()) {
                    dslSlide {
                        autoAnimate = true
                        slideConfig {
                            transition = Transition.NONE
                        }
                        content {
                            h2 { +"加上動畫" }
                            val file = "src/main/resources/json-example.json"
                            codeSnippet {
                                dataId = "code-animation"
                                language = "json"
                                highlightPattern = "none"
                                +include(file, linePattern = lines)
                            }
                        }
                    }
                }
                // code3 end

                markdownSlide {
                    content {
                        """            
                        ## 投影片程式碼寫法
                        ```kotlin []
                        ${include(slides, beginToken = "code3 begin", endToken = "code3 end")}
                        ```
                        """
                    }
                }
            }

            verticalSlides {
                // code4 begin
                for (lines in "[8-12|3-12|2-13|]".toLinePatterns().zip(listOf(3, 3, 2, 1))) {
                    dslSlide {
                        autoAnimate = true
                        slideConfig {
                            transition = Transition.NONE
                        }
                        content {
                            h2 { +"動畫和行數" }
                            val file = "src/main/resources/json-example.json"
                            codeSnippet {
                                dataId = "code-animation"
                                language = "json"
                                lineOffSet = lines.second
                                +include(file, linePattern = lines.first)
                            }
                        }
                    }
                }
                // code4 end

                markdownSlide {
                    content {
                        """            
                        ## 投影片程式碼寫法   
                        ```kotlin []
                        ${include(slides, beginToken = "code4 begin", endToken = "code4 end")}
                        ```
                        """
                    }
                }
            }

            verticalSlides {
                markdownSlide {
                    content {
                        """            
                        ## Live Demo  
                        
                        在演講的現場
                        
                        開始做投影片
                        
                        JCCONF 2022 PEKO PEKO
                        
                        QQ ㄋㄟ ㄋㄟ 好喝到咩噗茶
                        """
                    }
                }
            }
            verticalSlides {
                markdownSlide {
                    content {
                        """            
                        ## 最後宣傳一下 
                        """
                    }
                }

                markdownSlide {
                    content {
                        """            
                        ## Kotlin.tips
                        
                        [https://tw.kotlin.tips/](https://tw.kotlin.tips/)

                        """
                    }
                }

                markdownSlide {
                    content {
                        """            
                        ## Taiwan Kotlin User Group
                        
                        [https://taiwan-kotlin-user-group.github.io/](https://taiwan-kotlin-user-group.github.io/)

                        """
                    }
                }
            }
            markdownSlide {
                content {
                    """            
                    ## 投影片網址
                    - [https://gitpage.reccachao.net/2022JCConf/#/](https://gitpage.reccachao.net/2022JCConf/#/)
                    - [https://github.com/flamerecca/2022JCConf](https://github.com/flamerecca/2022JCConf)
                    """
                }
            }
            markdownSlide {
                content {
                    """            
                    ## 謝謝大家
                    
                    ![cat](https://styles.redditmedia.com/t5_2r5i1/styles/communityIcon_x4lqmqzu1hi81.jpg)
                    """
                }
            }
        }
    }
}
