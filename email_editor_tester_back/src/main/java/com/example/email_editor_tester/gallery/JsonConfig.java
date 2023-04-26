package com.example.email_editor_tester.gallery;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class JsonConfig {

    @Bean
    CommandLineRunner commandLineRunner(JsonRepository repository) {
        return args ->{
            Json Blank = new Json(
                    "Blank",
                    "{\n" +
                            "    \"counters\": {\n" +
                            "        \"u_row\": 1,\n" +
                            "        \"u_column\": 1\n" +
                            "    },\n" +
                            "    \"body\": {\n" +
                            "        \"id\": \"r6DuCvqBpq\",\n" +
                            "        \"rows\": [{\n" +
                            "            \"id\": \"_DW4iu7-wT\",\n" +
                            "            \"cells\": [1],\n" +
                            "            \"columns\": [{\n" +
                            "                \"id\": \"C1hvZ2qM7F\",\n" +
                            "                \"contents\": [],\n" +
                            "                \"values\": {\n" +
                            "                    \"_meta\": {\n" +
                            "                        \"htmlID\": \"u_column_1\",\n" +
                            "                        \"htmlClassNames\": \"u_column\"\n" +
                            "                    },\n" +
                            "                    \"border\": {},\n" +
                            "                    \"padding\": \"0px\",\n" +
                            "                    \"backgroundColor\": \"\"\n" +
                            "                }\n" +
                            "            }],\n" +
                            "            \"values\": {\n" +
                            "                \"displayCondition\": null,\n" +
                            "                \"columns\": false,\n" +
                            "                \"backgroundColor\": \"\",\n" +
                            "                \"columnsBackgroundColor\": \"\",\n" +
                            "                \"backgroundImage\": {\n" +
                            "                    \"url\": \"\",\n" +
                            "                    \"fullWidth\": true,\n" +
                            "                    \"repeat\": \"no-repeat\",\n" +
                            "                    \"size\": \"custom\",\n" +
                            "                    \"position\": \"center\"\n" +
                            "                },\n" +
                            "                \"padding\": \"0px\",\n" +
                            "                \"anchor\": \"\",\n" +
                            "                \"hideDesktop\": false,\n" +
                            "                \"_meta\": {\n" +
                            "                    \"htmlID\": \"u_row_1\",\n" +
                            "                    \"htmlClassNames\": \"u_row\"\n" +
                            "                },\n" +
                            "                \"selectable\": true,\n" +
                            "                \"draggable\": true,\n" +
                            "                \"duplicatable\": true,\n" +
                            "                \"deletable\": true,\n" +
                            "                \"hideable\": true\n" +
                            "            }\n" +
                            "        }],\n" +
                            "        \"values\": {\n" +
                            "            \"popupPosition\": \"center\",\n" +
                            "            \"popupWidth\": \"600px\",\n" +
                            "            \"popupHeight\": \"auto\",\n" +
                            "            \"borderRadius\": \"10px\",\n" +
                            "            \"contentAlign\": \"center\",\n" +
                            "            \"contentVerticalAlign\": \"center\",\n" +
                            "            \"contentWidth\": \"500px\",\n" +
                            "            \"fontFamily\": {\n" +
                            "                \"label\": \"Arial\",\n" +
                            "                \"value\": \"arial,helvetica,sans-serif\"\n" +
                            "            },\n" +
                            "            \"textColor\": \"#000000\",\n" +
                            "            \"popupBackgroundColor\": \"#FFFFFF\",\n" +
                            "            \"popupBackgroundImage\": {\n" +
                            "                \"url\": \"\",\n" +
                            "                \"fullWidth\": true,\n" +
                            "                \"repeat\": \"no-repeat\",\n" +
                            "                \"size\": \"cover\",\n" +
                            "                \"position\": \"center\"\n" +
                            "            },\n" +
                            "            \"popupOverlay_backgroundColor\": \"rgba(0, 0, 0, 0.1)\",\n" +
                            "            \"popupCloseButton_position\": \"top-right\",\n" +
                            "            \"popupCloseButton_backgroundColor\": \"#DDDDDD\",\n" +
                            "            \"popupCloseButton_iconColor\": \"#000000\",\n" +
                            "            \"popupCloseButton_borderRadius\": \"0px\",\n" +
                            "            \"popupCloseButton_margin\": \"0px\",\n" +
                            "            \"popupCloseButton_action\": {\n" +
                            "                \"name\": \"close_popup\",\n" +
                            "                \"attrs\": {\n" +
                            "                    \"onClick\": \"document.querySelector('.u-popup-container').style.display = 'none';\"\n" +
                            "                }\n" +
                            "            },\n" +
                            "            \"backgroundColor\": \"#e7e7e7\",\n" +
                            "            \"backgroundImage\": {\n" +
                            "                \"url\": \"\",\n" +
                            "                \"fullWidth\": true,\n" +
                            "                \"repeat\": \"no-repeat\",\n" +
                            "                \"size\": \"custom\",\n" +
                            "                \"position\": \"center\"\n" +
                            "            },\n" +
                            "            \"preheaderText\": \"\",\n" +
                            "            \"linkStyle\": {\n" +
                            "                \"body\": true,\n" +
                            "                \"linkColor\": \"#0000ee\",\n" +
                            "                \"linkHoverColor\": \"#0000ee\",\n" +
                            "                \"linkUnderline\": true,\n" +
                            "                \"linkHoverUnderline\": true\n" +
                            "            },\n" +
                            "            \"_meta\": {\n" +
                            "                \"htmlID\": \"u_body\",\n" +
                            "                \"htmlClassNames\": \"u_body\"\n" +
                            "            }\n" +
                            "        }\n" +
                            "    },\n" +
                            "    \"schemaVersion\": 13\n" +
                            "}"
            );
            Json oneColumn = new Json(
                    "One Column",
                    "{\n" +
                            "    \"counters\": {\n" +
                            "        \"u_row\": 4,\n" +
                            "        \"u_column\": 5,\n" +
                            "        \"u_content_text\": 4,\n" +
                            "        \"u_content_image\": 2,\n" +
                            "        \"u_content_button\": 2,\n" +
                            "        \"u_content_divider\": 4,\n" +
                            "        \"u_content_heading\": 3\n" +
                            "    },\n" +
                            "    \"body\": {\n" +
                            "        \"id\": \"fn2gPyp9VL\",\n" +
                            "        \"rows\": [{\n" +
                            "            \"id\": \"L74Frf9kmq\",\n" +
                            "            \"cells\": [1, 2],\n" +
                            "            \"columns\": [{\n" +
                            "                \"id\": \"sCYxVJ1pp3\",\n" +
                            "                \"contents\": [{\n" +
                            "                    \"id\": \"P0pm4sZeEd\",\n" +
                            "                    \"type\": \"image\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"src\": {\n" +
                            "                            \"url\": \"https://cdn.tools.unlayer.com/image/placeholder.png\",\n" +
                            "                            \"width\": 800,\n" +
                            "                            \"height\": 200\n" +
                            "                        },\n" +
                            "                        \"textAlign\": \"center\",\n" +
                            "                        \"altText\": \"company logo\",\n" +
                            "                        \"action\": {\n" +
                            "                            \"name\": \"web\",\n" +
                            "                            \"values\": {\n" +
                            "                                \"href\": \"\",\n" +
                            "                                \"target\": \"_blank\"\n" +
                            "                            }\n" +
                            "                        },\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_image_2\",\n" +
                            "                            \"htmlClassNames\": \"u_content_image\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true\n" +
                            "                    }\n" +
                            "                }],\n" +
                            "                \"values\": {\n" +
                            "                    \"_meta\": {\n" +
                            "                        \"htmlID\": \"u_column_3\",\n" +
                            "                        \"htmlClassNames\": \"u_column\"\n" +
                            "                    },\n" +
                            "                    \"border\": {},\n" +
                            "                    \"padding\": \"0px\",\n" +
                            "                    \"borderRadius\": \"0px\",\n" +
                            "                    \"backgroundColor\": \"\"\n" +
                            "                }\n" +
                            "            }, {\n" +
                            "                \"id\": \"TUO0-fILKw\",\n" +
                            "                \"contents\": [{\n" +
                            "                    \"id\": \"zxaCjY_QyN\",\n" +
                            "                    \"type\": \"heading\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"headingType\": \"h1\",\n" +
                            "                        \"fontSize\": \"22px\",\n" +
                            "                        \"textAlign\": \"center\",\n" +
                            "                        \"lineHeight\": \"140%\",\n" +
                            "                        \"linkStyle\": {\n" +
                            "                            \"inherit\": true,\n" +
                            "                            \"linkColor\": \"#0000ee\",\n" +
                            "                            \"linkHoverColor\": \"#0000ee\",\n" +
                            "                            \"linkUnderline\": true,\n" +
                            "                            \"linkHoverUnderline\": true\n" +
                            "                        },\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_heading_3\",\n" +
                            "                            \"htmlClassNames\": \"u_content_heading\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true,\n" +
                            "                        \"text\": \"<strong>Company name</strong>\"\n" +
                            "                    }\n" +
                            "                }],\n" +
                            "                \"values\": {\n" +
                            "                    \"_meta\": {\n" +
                            "                        \"htmlID\": \"u_column_4\",\n" +
                            "                        \"htmlClassNames\": \"u_column\"\n" +
                            "                    },\n" +
                            "                    \"border\": {},\n" +
                            "                    \"padding\": \"0px\",\n" +
                            "                    \"borderRadius\": \"0px\",\n" +
                            "                    \"backgroundColor\": \"\"\n" +
                            "                }\n" +
                            "            }],\n" +
                            "            \"values\": {\n" +
                            "                \"displayCondition\": null,\n" +
                            "                \"columns\": false,\n" +
                            "                \"backgroundColor\": \"\",\n" +
                            "                \"columnsBackgroundColor\": \"\",\n" +
                            "                \"backgroundImage\": {\n" +
                            "                    \"url\": \"\",\n" +
                            "                    \"fullWidth\": true,\n" +
                            "                    \"repeat\": \"no-repeat\",\n" +
                            "                    \"size\": \"custom\",\n" +
                            "                    \"position\": \"center\"\n" +
                            "                },\n" +
                            "                \"padding\": \"0px\",\n" +
                            "                \"anchor\": \"\",\n" +
                            "                \"hideDesktop\": false,\n" +
                            "                \"_meta\": {\n" +
                            "                    \"htmlID\": \"u_row_3\",\n" +
                            "                    \"htmlClassNames\": \"u_row\"\n" +
                            "                },\n" +
                            "                \"selectable\": true,\n" +
                            "                \"draggable\": true,\n" +
                            "                \"duplicatable\": true,\n" +
                            "                \"deletable\": true,\n" +
                            "                \"hideable\": true\n" +
                            "            }\n" +
                            "        }, {\n" +
                            "            \"id\": \"LtBDifJ9Pr\",\n" +
                            "            \"cells\": [1],\n" +
                            "            \"columns\": [{\n" +
                            "                \"id\": \"UqdxQlVWJA\",\n" +
                            "                \"contents\": [{\n" +
                            "                    \"id\": \"YI1gKbmwq2\",\n" +
                            "                    \"type\": \"divider\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"width\": \"0%\",\n" +
                            "                        \"border\": {\n" +
                            "                            \"borderTopWidth\": \"1px\",\n" +
                            "                            \"borderTopStyle\": \"solid\",\n" +
                            "                            \"borderTopColor\": \"#BBBBBB\"\n" +
                            "                        },\n" +
                            "                        \"textAlign\": \"center\",\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_divider_3\",\n" +
                            "                            \"htmlClassNames\": \"u_content_divider\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true\n" +
                            "                    }\n" +
                            "                }, {\n" +
                            "                    \"id\": \"yWJzGizX4X\",\n" +
                            "                    \"type\": \"divider\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"width\": \"100%\",\n" +
                            "                        \"border\": {\n" +
                            "                            \"borderTopWidth\": \"1px\",\n" +
                            "                            \"borderTopStyle\": \"solid\",\n" +
                            "                            \"borderTopColor\": \"#BBBBBB\"\n" +
                            "                        },\n" +
                            "                        \"textAlign\": \"center\",\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_divider_1\",\n" +
                            "                            \"htmlClassNames\": \"u_content_divider\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true\n" +
                            "                    }\n" +
                            "                }, {\n" +
                            "                    \"id\": \"BJEJXm_aQG\",\n" +
                            "                    \"type\": \"image\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"src\": {\n" +
                            "                            \"url\": \"https://cdn.tools.unlayer.com/image/placeholder.png\",\n" +
                            "                            \"width\": 800,\n" +
                            "                            \"height\": 200\n" +
                            "                        },\n" +
                            "                        \"textAlign\": \"center\",\n" +
                            "                        \"altText\": \"\",\n" +
                            "                        \"action\": {\n" +
                            "                            \"name\": \"web\",\n" +
                            "                            \"values\": {\n" +
                            "                                \"href\": \"\",\n" +
                            "                                \"target\": \"_blank\"\n" +
                            "                            }\n" +
                            "                        },\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_image_1\",\n" +
                            "                            \"htmlClassNames\": \"u_content_image\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true\n" +
                            "                    }\n" +
                            "                }, {\n" +
                            "                    \"id\": \"M6FNAgm0ZE\",\n" +
                            "                    \"type\": \"divider\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"width\": \"100%\",\n" +
                            "                        \"border\": {\n" +
                            "                            \"borderTopWidth\": \"1px\",\n" +
                            "                            \"borderTopStyle\": \"solid\",\n" +
                            "                            \"borderTopColor\": \"#BBBBBB\"\n" +
                            "                        },\n" +
                            "                        \"textAlign\": \"center\",\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_divider_2\",\n" +
                            "                            \"htmlClassNames\": \"u_content_divider\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true\n" +
                            "                    }\n" +
                            "                }, {\n" +
                            "                    \"id\": \"tDPh0IVUzV\",\n" +
                            "                    \"type\": \"heading\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"headingType\": \"h4\",\n" +
                            "                        \"fontSize\": \"16px\",\n" +
                            "                        \"textAlign\": \"center\",\n" +
                            "                        \"lineHeight\": \"140%\",\n" +
                            "                        \"linkStyle\": {\n" +
                            "                            \"inherit\": true,\n" +
                            "                            \"linkColor\": \"#0000ee\",\n" +
                            "                            \"linkHoverColor\": \"#0000ee\",\n" +
                            "                            \"linkUnderline\": true,\n" +
                            "                            \"linkHoverUnderline\": true\n" +
                            "                        },\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_heading_2\",\n" +
                            "                            \"htmlClassNames\": \"u_content_heading\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true,\n" +
                            "                        \"text\": \"Your Title Goes Here\"\n" +
                            "                    }\n" +
                            "                }, {\n" +
                            "                    \"id\": \"xuyqOpdz_u\",\n" +
                            "                    \"type\": \"text\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"textAlign\": \"left\",\n" +
                            "                        \"lineHeight\": \"140%\",\n" +
                            "                        \"linkStyle\": {\n" +
                            "                            \"inherit\": true,\n" +
                            "                            \"linkColor\": \"#0000ee\",\n" +
                            "                            \"linkHoverColor\": \"#0000ee\",\n" +
                            "                            \"linkUnderline\": true,\n" +
                            "                            \"linkHoverUnderline\": true\n" +
                            "                        },\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_text_1\",\n" +
                            "                            \"htmlClassNames\": \"u_content_text\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true,\n" +
                            "                        \"text\": \"<p style=\\\"line-height: 140%;\\\">This is a text area. You can include any number of words here, split text into segments and sentences, and utilize fonts to create titles or separate text into paragraphs. Through this space, you can explain your company and what services it provides...</p>\"\n" +
                            "                    }\n" +
                            "                }, {\n" +
                            "                    \"id\": \"UsDyKyidK8\",\n" +
                            "                    \"type\": \"button\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"href\": {\n" +
                            "                            \"name\": \"web\",\n" +
                            "                            \"values\": {\n" +
                            "                                \"href\": \"\",\n" +
                            "                                \"target\": \"_blank\"\n" +
                            "                            }\n" +
                            "                        },\n" +
                            "                        \"buttonColors\": {\n" +
                            "                            \"color\": \"#FFFFFF\",\n" +
                            "                            \"backgroundColor\": \"#3AAEE0\",\n" +
                            "                            \"hoverColor\": \"#FFFFFF\",\n" +
                            "                            \"hoverBackgroundColor\": \"#3AAEE0\"\n" +
                            "                        },\n" +
                            "                        \"size\": {\n" +
                            "                            \"autoWidth\": true,\n" +
                            "                            \"width\": \"100%\"\n" +
                            "                        },\n" +
                            "                        \"fontSize\": \"14px\",\n" +
                            "                        \"textAlign\": \"center\",\n" +
                            "                        \"lineHeight\": \"120%\",\n" +
                            "                        \"padding\": \"10px 20px\",\n" +
                            "                        \"border\": {},\n" +
                            "                        \"borderRadius\": \"4px\",\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_button_2\",\n" +
                            "                            \"htmlClassNames\": \"u_content_button\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true,\n" +
                            "                        \"text\": \"<span style=\\\"line-height: 16.8px;\\\">Button Text</span>\",\n" +
                            "                        \"calculatedWidth\": 110,\n" +
                            "                        \"calculatedHeight\": 37\n" +
                            "                    }\n" +
                            "                }],\n" +
                            "                \"values\": {\n" +
                            "                    \"_meta\": {\n" +
                            "                        \"htmlID\": \"u_column_1\",\n" +
                            "                        \"htmlClassNames\": \"u_column\"\n" +
                            "                    },\n" +
                            "                    \"border\": {},\n" +
                            "                    \"padding\": \"0px\",\n" +
                            "                    \"backgroundColor\": \"\"\n" +
                            "                }\n" +
                            "            }],\n" +
                            "            \"values\": {\n" +
                            "                \"displayCondition\": null,\n" +
                            "                \"columns\": false,\n" +
                            "                \"backgroundColor\": \"\",\n" +
                            "                \"columnsBackgroundColor\": \"\",\n" +
                            "                \"backgroundImage\": {\n" +
                            "                    \"url\": \"\",\n" +
                            "                    \"fullWidth\": true,\n" +
                            "                    \"repeat\": \"no-repeat\",\n" +
                            "                    \"size\": \"custom\",\n" +
                            "                    \"position\": \"center\"\n" +
                            "                },\n" +
                            "                \"padding\": \"0px\",\n" +
                            "                \"anchor\": \"\",\n" +
                            "                \"hideDesktop\": false,\n" +
                            "                \"_meta\": {\n" +
                            "                    \"htmlID\": \"u_row_1\",\n" +
                            "                    \"htmlClassNames\": \"u_row\"\n" +
                            "                },\n" +
                            "                \"selectable\": true,\n" +
                            "                \"draggable\": true,\n" +
                            "                \"duplicatable\": true,\n" +
                            "                \"deletable\": true,\n" +
                            "                \"hideable\": true\n" +
                            "            }\n" +
                            "        }, {\n" +
                            "            \"id\": \"5RUSdkkobF\",\n" +
                            "            \"cells\": [1],\n" +
                            "            \"columns\": [{\n" +
                            "                \"id\": \"sBGXbMwJba\",\n" +
                            "                \"contents\": [{\n" +
                            "                    \"id\": \"C9IqL-JgPb\",\n" +
                            "                    \"type\": \"text\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"fontSize\": \"12px\",\n" +
                            "                        \"textAlign\": \"center\",\n" +
                            "                        \"lineHeight\": \"140%\",\n" +
                            "                        \"linkStyle\": {\n" +
                            "                            \"inherit\": true,\n" +
                            "                            \"linkColor\": \"#0000ee\",\n" +
                            "                            \"linkHoverColor\": \"#0000ee\",\n" +
                            "                            \"linkUnderline\": true,\n" +
                            "                            \"linkHoverUnderline\": true\n" +
                            "                        },\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_text_4\",\n" +
                            "                            \"htmlClassNames\": \"u_content_text\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true,\n" +
                            "                        \"text\": \"<p style=\\\"line-height: 140%;\\\">Company street, Company city, Company country.</p>\"\n" +
                            "                    }\n" +
                            "                }],\n" +
                            "                \"values\": {\n" +
                            "                    \"_meta\": {\n" +
                            "                        \"htmlID\": \"u_column_5\",\n" +
                            "                        \"htmlClassNames\": \"u_column\"\n" +
                            "                    },\n" +
                            "                    \"border\": {},\n" +
                            "                    \"padding\": \"0px\",\n" +
                            "                    \"borderRadius\": \"0px\",\n" +
                            "                    \"backgroundColor\": \"#ced4d9\"\n" +
                            "                }\n" +
                            "            }],\n" +
                            "            \"values\": {\n" +
                            "                \"displayCondition\": null,\n" +
                            "                \"columns\": false,\n" +
                            "                \"backgroundColor\": \"\",\n" +
                            "                \"columnsBackgroundColor\": \"\",\n" +
                            "                \"backgroundImage\": {\n" +
                            "                    \"url\": \"\",\n" +
                            "                    \"fullWidth\": true,\n" +
                            "                    \"repeat\": \"no-repeat\",\n" +
                            "                    \"size\": \"custom\",\n" +
                            "                    \"position\": \"center\"\n" +
                            "                },\n" +
                            "                \"padding\": \"0px\",\n" +
                            "                \"anchor\": \"\",\n" +
                            "                \"hideDesktop\": false,\n" +
                            "                \"_meta\": {\n" +
                            "                    \"htmlID\": \"u_row_4\",\n" +
                            "                    \"htmlClassNames\": \"u_row\"\n" +
                            "                },\n" +
                            "                \"selectable\": true,\n" +
                            "                \"draggable\": true,\n" +
                            "                \"duplicatable\": true,\n" +
                            "                \"deletable\": true,\n" +
                            "                \"hideable\": true\n" +
                            "            }\n" +
                            "        }],\n" +
                            "        \"values\": {\n" +
                            "            \"popupPosition\": \"center\",\n" +
                            "            \"popupWidth\": \"600px\",\n" +
                            "            \"popupHeight\": \"auto\",\n" +
                            "            \"borderRadius\": \"10px\",\n" +
                            "            \"contentAlign\": \"center\",\n" +
                            "            \"contentVerticalAlign\": \"center\",\n" +
                            "            \"contentWidth\": \"500px\",\n" +
                            "            \"fontFamily\": {\n" +
                            "                \"label\": \"Arial\",\n" +
                            "                \"value\": \"arial,helvetica,sans-serif\"\n" +
                            "            },\n" +
                            "            \"textColor\": \"#000000\",\n" +
                            "            \"popupBackgroundColor\": \"#FFFFFF\",\n" +
                            "            \"popupBackgroundImage\": {\n" +
                            "                \"url\": \"\",\n" +
                            "                \"fullWidth\": true,\n" +
                            "                \"repeat\": \"no-repeat\",\n" +
                            "                \"size\": \"cover\",\n" +
                            "                \"position\": \"center\"\n" +
                            "            },\n" +
                            "            \"popupOverlay_backgroundColor\": \"rgba(0, 0, 0, 0.1)\",\n" +
                            "            \"popupCloseButton_position\": \"top-right\",\n" +
                            "            \"popupCloseButton_backgroundColor\": \"#DDDDDD\",\n" +
                            "            \"popupCloseButton_iconColor\": \"#000000\",\n" +
                            "            \"popupCloseButton_borderRadius\": \"0px\",\n" +
                            "            \"popupCloseButton_margin\": \"0px\",\n" +
                            "            \"popupCloseButton_action\": {\n" +
                            "                \"name\": \"close_popup\",\n" +
                            "                \"attrs\": {\n" +
                            "                    \"onClick\": \"document.querySelector('.u-popup-container').style.display = 'none';\"\n" +
                            "                }\n" +
                            "            },\n" +
                            "            \"backgroundColor\": \"#ecf0f1\",\n" +
                            "            \"backgroundImage\": {\n" +
                            "                \"url\": \"\",\n" +
                            "                \"fullWidth\": true,\n" +
                            "                \"repeat\": \"no-repeat\",\n" +
                            "                \"size\": \"custom\",\n" +
                            "                \"position\": \"center\"\n" +
                            "            },\n" +
                            "            \"preheaderText\": \"\",\n" +
                            "            \"linkStyle\": {\n" +
                            "                \"body\": true,\n" +
                            "                \"linkColor\": \"#0000ee\",\n" +
                            "                \"linkHoverColor\": \"#0000ee\",\n" +
                            "                \"linkUnderline\": true,\n" +
                            "                \"linkHoverUnderline\": true\n" +
                            "            },\n" +
                            "            \"_meta\": {\n" +
                            "                \"htmlID\": \"u_body\",\n" +
                            "                \"htmlClassNames\": \"u_body\"\n" +
                            "            }\n" +
                            "        }\n" +
                            "    },\n" +
                            "    \"schemaVersion\": 13\n" +
                            "}"
            );
            Json twoColumn = new Json(
                    "Two Column",
                    "{\n" +
                            "    \"counters\": {\n" +
                            "        \"u_row\": 5,\n" +
                            "        \"u_column\": 7,\n" +
                            "        \"u_content_text\": 5,\n" +
                            "        \"u_content_image\": 2,\n" +
                            "        \"u_content_divider\": 5,\n" +
                            "        \"u_content_heading\": 4\n" +
                            "    },\n" +
                            "    \"body\": {\n" +
                            "        \"id\": \"yDm5nEcGZH\",\n" +
                            "        \"rows\": [{\n" +
                            "            \"id\": \"OMK-fKvau9\",\n" +
                            "            \"cells\": [1, 2],\n" +
                            "            \"columns\": [{\n" +
                            "                \"id\": \"IFQCIBmGFf\",\n" +
                            "                \"contents\": [{\n" +
                            "                    \"id\": \"_qTuqGjYgm\",\n" +
                            "                    \"type\": \"image\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"src\": {\n" +
                            "                            \"url\": \"https://cdn.tools.unlayer.com/image/placeholder.png\",\n" +
                            "                            \"width\": 800,\n" +
                            "                            \"height\": 200\n" +
                            "                        },\n" +
                            "                        \"textAlign\": \"center\",\n" +
                            "                        \"altText\": \"company logo\",\n" +
                            "                        \"action\": {\n" +
                            "                            \"name\": \"web\",\n" +
                            "                            \"values\": {\n" +
                            "                                \"href\": \"\",\n" +
                            "                                \"target\": \"_blank\"\n" +
                            "                            }\n" +
                            "                        },\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_image_1\",\n" +
                            "                            \"htmlClassNames\": \"u_content_image\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true\n" +
                            "                    }\n" +
                            "                }],\n" +
                            "                \"values\": {\n" +
                            "                    \"_meta\": {\n" +
                            "                        \"htmlID\": \"u_column_2\",\n" +
                            "                        \"htmlClassNames\": \"u_column\"\n" +
                            "                    },\n" +
                            "                    \"border\": {},\n" +
                            "                    \"padding\": \"0px\",\n" +
                            "                    \"borderRadius\": \"0px\",\n" +
                            "                    \"backgroundColor\": \"\"\n" +
                            "                }\n" +
                            "            }, {\n" +
                            "                \"id\": \"bBq9QbJk2Y\",\n" +
                            "                \"contents\": [{\n" +
                            "                    \"id\": \"oypjWeo-IM\",\n" +
                            "                    \"type\": \"heading\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"headingType\": \"h1\",\n" +
                            "                        \"fontSize\": \"22px\",\n" +
                            "                        \"textAlign\": \"center\",\n" +
                            "                        \"lineHeight\": \"140%\",\n" +
                            "                        \"linkStyle\": {\n" +
                            "                            \"inherit\": true,\n" +
                            "                            \"linkColor\": \"#0000ee\",\n" +
                            "                            \"linkHoverColor\": \"#0000ee\",\n" +
                            "                            \"linkUnderline\": true,\n" +
                            "                            \"linkHoverUnderline\": true\n" +
                            "                        },\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_heading_1\",\n" +
                            "                            \"htmlClassNames\": \"u_content_heading\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true,\n" +
                            "                        \"text\": \"<strong>Company name</strong>\"\n" +
                            "                    }\n" +
                            "                }],\n" +
                            "                \"values\": {\n" +
                            "                    \"_meta\": {\n" +
                            "                        \"htmlID\": \"u_column_3\",\n" +
                            "                        \"htmlClassNames\": \"u_column\"\n" +
                            "                    },\n" +
                            "                    \"border\": {},\n" +
                            "                    \"padding\": \"0px\",\n" +
                            "                    \"borderRadius\": \"0px\",\n" +
                            "                    \"backgroundColor\": \"\"\n" +
                            "                }\n" +
                            "            }],\n" +
                            "            \"values\": {\n" +
                            "                \"displayCondition\": null,\n" +
                            "                \"columns\": false,\n" +
                            "                \"backgroundColor\": \"\",\n" +
                            "                \"columnsBackgroundColor\": \"\",\n" +
                            "                \"backgroundImage\": {\n" +
                            "                    \"url\": \"\",\n" +
                            "                    \"fullWidth\": true,\n" +
                            "                    \"repeat\": \"no-repeat\",\n" +
                            "                    \"size\": \"custom\",\n" +
                            "                    \"position\": \"center\"\n" +
                            "                },\n" +
                            "                \"padding\": \"0px\",\n" +
                            "                \"anchor\": \"\",\n" +
                            "                \"hideDesktop\": false,\n" +
                            "                \"_meta\": {\n" +
                            "                    \"htmlID\": \"u_row_2\",\n" +
                            "                    \"htmlClassNames\": \"u_row\"\n" +
                            "                },\n" +
                            "                \"selectable\": true,\n" +
                            "                \"draggable\": true,\n" +
                            "                \"duplicatable\": true,\n" +
                            "                \"deletable\": true,\n" +
                            "                \"hideable\": true\n" +
                            "            }\n" +
                            "        }, {\n" +
                            "            \"id\": \"PLszH3ffQS\",\n" +
                            "            \"cells\": [1],\n" +
                            "            \"columns\": [{\n" +
                            "                \"id\": \"3KBPblSlUU\",\n" +
                            "                \"contents\": [{\n" +
                            "                    \"id\": \"bYUbRnoDpp\",\n" +
                            "                    \"type\": \"divider\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"width\": \"100%\",\n" +
                            "                        \"border\": {\n" +
                            "                            \"borderTopWidth\": \"1px\",\n" +
                            "                            \"borderTopStyle\": \"solid\",\n" +
                            "                            \"borderTopColor\": \"#BBBBBB\"\n" +
                            "                        },\n" +
                            "                        \"textAlign\": \"center\",\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_divider_1\",\n" +
                            "                            \"htmlClassNames\": \"u_content_divider\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true\n" +
                            "                    }\n" +
                            "                }, {\n" +
                            "                    \"id\": \"jCHeYNfduE\",\n" +
                            "                    \"type\": \"image\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"src\": {\n" +
                            "                            \"url\": \"https://cdn.tools.unlayer.com/image/placeholder.png\",\n" +
                            "                            \"width\": 800,\n" +
                            "                            \"height\": 200\n" +
                            "                        },\n" +
                            "                        \"textAlign\": \"center\",\n" +
                            "                        \"altText\": \"\",\n" +
                            "                        \"action\": {\n" +
                            "                            \"name\": \"web\",\n" +
                            "                            \"values\": {\n" +
                            "                                \"href\": \"\",\n" +
                            "                                \"target\": \"_blank\"\n" +
                            "                            }\n" +
                            "                        },\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_image_2\",\n" +
                            "                            \"htmlClassNames\": \"u_content_image\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true\n" +
                            "                    }\n" +
                            "                }, {\n" +
                            "                    \"id\": \"azF7O53i8i\",\n" +
                            "                    \"type\": \"divider\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"width\": \"100%\",\n" +
                            "                        \"border\": {\n" +
                            "                            \"borderTopWidth\": \"1px\",\n" +
                            "                            \"borderTopStyle\": \"solid\",\n" +
                            "                            \"borderTopColor\": \"#BBBBBB\"\n" +
                            "                        },\n" +
                            "                        \"textAlign\": \"center\",\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_divider_2\",\n" +
                            "                            \"htmlClassNames\": \"u_content_divider\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true\n" +
                            "                    }\n" +
                            "                }, {\n" +
                            "                    \"id\": \"HxUYi6mDxB\",\n" +
                            "                    \"type\": \"heading\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"headingType\": \"h3\",\n" +
                            "                        \"fontSize\": \"18px\",\n" +
                            "                        \"textAlign\": \"center\",\n" +
                            "                        \"lineHeight\": \"140%\",\n" +
                            "                        \"linkStyle\": {\n" +
                            "                            \"inherit\": true,\n" +
                            "                            \"linkColor\": \"#0000ee\",\n" +
                            "                            \"linkHoverColor\": \"#0000ee\",\n" +
                            "                            \"linkUnderline\": true,\n" +
                            "                            \"linkHoverUnderline\": true\n" +
                            "                        },\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_heading_2\",\n" +
                            "                            \"htmlClassNames\": \"u_content_heading\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true,\n" +
                            "                        \"text\": \"Your Title Goes Here\"\n" +
                            "                    }\n" +
                            "                }, {\n" +
                            "                    \"id\": \"y9LH_GHZyY\",\n" +
                            "                    \"type\": \"text\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"textAlign\": \"left\",\n" +
                            "                        \"lineHeight\": \"140%\",\n" +
                            "                        \"linkStyle\": {\n" +
                            "                            \"inherit\": true,\n" +
                            "                            \"linkColor\": \"#0000ee\",\n" +
                            "                            \"linkHoverColor\": \"#0000ee\",\n" +
                            "                            \"linkUnderline\": true,\n" +
                            "                            \"linkHoverUnderline\": true\n" +
                            "                        },\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_text_1\",\n" +
                            "                            \"htmlClassNames\": \"u_content_text\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true,\n" +
                            "                        \"text\": \"<p style=\\\"line-height: 140%;\\\">This is your welcome section. Here you can describe your business and the services it provides. Just click on this box to start editing. You will have access to all the formatting tools once you click inside the text area. This is a text field where you can add unlimited amount of text, divide it into sentences and paragraphs, and apply fonts to create titles or section breaks. Use this space to explain what your business does and the services it offers...</p>\"\n" +
                            "                    }\n" +
                            "                }, {\n" +
                            "                    \"id\": \"HJLGpIn-YV\",\n" +
                            "                    \"type\": \"divider\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"width\": \"100%\",\n" +
                            "                        \"border\": {\n" +
                            "                            \"borderTopWidth\": \"1px\",\n" +
                            "                            \"borderTopStyle\": \"solid\",\n" +
                            "                            \"borderTopColor\": \"#BBBBBB\"\n" +
                            "                        },\n" +
                            "                        \"textAlign\": \"center\",\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_divider_3\",\n" +
                            "                            \"htmlClassNames\": \"u_content_divider\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true\n" +
                            "                    }\n" +
                            "                }],\n" +
                            "                \"values\": {\n" +
                            "                    \"_meta\": {\n" +
                            "                        \"htmlID\": \"u_column_1\",\n" +
                            "                        \"htmlClassNames\": \"u_column\"\n" +
                            "                    },\n" +
                            "                    \"border\": {},\n" +
                            "                    \"padding\": \"0px\",\n" +
                            "                    \"backgroundColor\": \"\"\n" +
                            "                }\n" +
                            "            }],\n" +
                            "            \"values\": {\n" +
                            "                \"displayCondition\": null,\n" +
                            "                \"columns\": false,\n" +
                            "                \"backgroundColor\": \"\",\n" +
                            "                \"columnsBackgroundColor\": \"\",\n" +
                            "                \"backgroundImage\": {\n" +
                            "                    \"url\": \"\",\n" +
                            "                    \"fullWidth\": true,\n" +
                            "                    \"repeat\": \"no-repeat\",\n" +
                            "                    \"size\": \"custom\",\n" +
                            "                    \"position\": \"center\"\n" +
                            "                },\n" +
                            "                \"padding\": \"0px\",\n" +
                            "                \"anchor\": \"\",\n" +
                            "                \"hideDesktop\": false,\n" +
                            "                \"_meta\": {\n" +
                            "                    \"htmlID\": \"u_row_1\",\n" +
                            "                    \"htmlClassNames\": \"u_row\"\n" +
                            "                },\n" +
                            "                \"selectable\": true,\n" +
                            "                \"draggable\": true,\n" +
                            "                \"duplicatable\": true,\n" +
                            "                \"deletable\": true,\n" +
                            "                \"hideable\": true\n" +
                            "            }\n" +
                            "        }, {\n" +
                            "            \"id\": \"tDR02xkDTP\",\n" +
                            "            \"cells\": [1, 1],\n" +
                            "            \"columns\": [{\n" +
                            "                \"id\": \"86N9FKBKRe\",\n" +
                            "                \"contents\": [{\n" +
                            "                    \"id\": \"MoiVdAf_1-\",\n" +
                            "                    \"type\": \"heading\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"headingType\": \"h4\",\n" +
                            "                        \"fontSize\": \"16px\",\n" +
                            "                        \"textAlign\": \"left\",\n" +
                            "                        \"lineHeight\": \"140%\",\n" +
                            "                        \"linkStyle\": {\n" +
                            "                            \"inherit\": true,\n" +
                            "                            \"linkColor\": \"#0000ee\",\n" +
                            "                            \"linkHoverColor\": \"#0000ee\",\n" +
                            "                            \"linkUnderline\": true,\n" +
                            "                            \"linkHoverUnderline\": true\n" +
                            "                        },\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_heading_3\",\n" +
                            "                            \"htmlClassNames\": \"u_content_heading\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true,\n" +
                            "                        \"text\": \"Sub-headline1\"\n" +
                            "                    }\n" +
                            "                }, {\n" +
                            "                    \"id\": \"oYQ3lq7Ufs\",\n" +
                            "                    \"type\": \"text\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"textAlign\": \"left\",\n" +
                            "                        \"lineHeight\": \"140%\",\n" +
                            "                        \"linkStyle\": {\n" +
                            "                            \"inherit\": true,\n" +
                            "                            \"linkColor\": \"#0000ee\",\n" +
                            "                            \"linkHoverColor\": \"#0000ee\",\n" +
                            "                            \"linkUnderline\": true,\n" +
                            "                            \"linkHoverUnderline\": true\n" +
                            "                        },\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_text_2\",\n" +
                            "                            \"htmlClassNames\": \"u_content_text\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true,\n" +
                            "                        \"text\": \"<p style=\\\"line-height: 140%;\\\">This is a new Text block. Change the text.</p>\"\n" +
                            "                    }\n" +
                            "                }],\n" +
                            "                \"values\": {\n" +
                            "                    \"_meta\": {\n" +
                            "                        \"htmlID\": \"u_column_4\",\n" +
                            "                        \"htmlClassNames\": \"u_column\"\n" +
                            "                    },\n" +
                            "                    \"border\": {},\n" +
                            "                    \"padding\": \"0px\",\n" +
                            "                    \"borderRadius\": \"0px\",\n" +
                            "                    \"backgroundColor\": \"\"\n" +
                            "                }\n" +
                            "            }, {\n" +
                            "                \"id\": \"HTsoAMnWF5\",\n" +
                            "                \"contents\": [{\n" +
                            "                    \"id\": \"pgz1_ubwBi\",\n" +
                            "                    \"type\": \"heading\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"headingType\": \"h4\",\n" +
                            "                        \"fontSize\": \"16px\",\n" +
                            "                        \"textAlign\": \"left\",\n" +
                            "                        \"lineHeight\": \"140%\",\n" +
                            "                        \"linkStyle\": {\n" +
                            "                            \"inherit\": true,\n" +
                            "                            \"linkColor\": \"#0000ee\",\n" +
                            "                            \"linkHoverColor\": \"#0000ee\",\n" +
                            "                            \"linkUnderline\": true,\n" +
                            "                            \"linkHoverUnderline\": true\n" +
                            "                        },\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_heading_4\",\n" +
                            "                            \"htmlClassNames\": \"u_content_heading\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true,\n" +
                            "                        \"text\": \"Sub-headline2\"\n" +
                            "                    }\n" +
                            "                }, {\n" +
                            "                    \"id\": \"kdhMTy84J5\",\n" +
                            "                    \"type\": \"text\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"textAlign\": \"left\",\n" +
                            "                        \"lineHeight\": \"140%\",\n" +
                            "                        \"linkStyle\": {\n" +
                            "                            \"inherit\": true,\n" +
                            "                            \"linkColor\": \"#0000ee\",\n" +
                            "                            \"linkHoverColor\": \"#0000ee\",\n" +
                            "                            \"linkUnderline\": true,\n" +
                            "                            \"linkHoverUnderline\": true\n" +
                            "                        },\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_text_3\",\n" +
                            "                            \"htmlClassNames\": \"u_content_text\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true,\n" +
                            "                        \"text\": \"<p style=\\\"line-height: 140%;\\\">This is a new Text block. Change the text.</p>\"\n" +
                            "                    }\n" +
                            "                }],\n" +
                            "                \"values\": {\n" +
                            "                    \"_meta\": {\n" +
                            "                        \"htmlID\": \"u_column_5\",\n" +
                            "                        \"htmlClassNames\": \"u_column\"\n" +
                            "                    },\n" +
                            "                    \"border\": {},\n" +
                            "                    \"padding\": \"0px\",\n" +
                            "                    \"borderRadius\": \"0px\",\n" +
                            "                    \"backgroundColor\": \"\"\n" +
                            "                }\n" +
                            "            }],\n" +
                            "            \"values\": {\n" +
                            "                \"displayCondition\": null,\n" +
                            "                \"columns\": false,\n" +
                            "                \"backgroundColor\": \"\",\n" +
                            "                \"columnsBackgroundColor\": \"\",\n" +
                            "                \"backgroundImage\": {\n" +
                            "                    \"url\": \"\",\n" +
                            "                    \"fullWidth\": true,\n" +
                            "                    \"repeat\": \"no-repeat\",\n" +
                            "                    \"size\": \"custom\",\n" +
                            "                    \"position\": \"center\"\n" +
                            "                },\n" +
                            "                \"padding\": \"0px\",\n" +
                            "                \"anchor\": \"\",\n" +
                            "                \"hideDesktop\": false,\n" +
                            "                \"_meta\": {\n" +
                            "                    \"htmlID\": \"u_row_3\",\n" +
                            "                    \"htmlClassNames\": \"u_row\"\n" +
                            "                },\n" +
                            "                \"selectable\": true,\n" +
                            "                \"draggable\": true,\n" +
                            "                \"duplicatable\": true,\n" +
                            "                \"deletable\": true,\n" +
                            "                \"hideable\": true\n" +
                            "            }\n" +
                            "        }, {\n" +
                            "            \"id\": \"b6ARaBBm4h\",\n" +
                            "            \"cells\": [1],\n" +
                            "            \"columns\": [{\n" +
                            "                \"id\": \"H7pE0U6qgT\",\n" +
                            "                \"contents\": [{\n" +
                            "                    \"id\": \"iUiuOps3_s\",\n" +
                            "                    \"type\": \"text\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"fontSize\": \"12px\",\n" +
                            "                        \"textAlign\": \"center\",\n" +
                            "                        \"lineHeight\": \"140%\",\n" +
                            "                        \"linkStyle\": {\n" +
                            "                            \"inherit\": true,\n" +
                            "                            \"linkColor\": \"#0000ee\",\n" +
                            "                            \"linkHoverColor\": \"#0000ee\",\n" +
                            "                            \"linkUnderline\": true,\n" +
                            "                            \"linkHoverUnderline\": true\n" +
                            "                        },\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_text_5\",\n" +
                            "                            \"htmlClassNames\": \"u_content_text\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true,\n" +
                            "                        \"text\": \"<p style=\\\"line-height: 140%;\\\">Company street, Company city, Company country.</p>\"\n" +
                            "                    }\n" +
                            "                }],\n" +
                            "                \"values\": {\n" +
                            "                    \"_meta\": {\n" +
                            "                        \"htmlID\": \"u_column_7\",\n" +
                            "                        \"htmlClassNames\": \"u_column\"\n" +
                            "                    },\n" +
                            "                    \"border\": {},\n" +
                            "                    \"padding\": \"0px\",\n" +
                            "                    \"borderRadius\": \"0px\",\n" +
                            "                    \"backgroundColor\": \"#ced4d9\"\n" +
                            "                }\n" +
                            "            }],\n" +
                            "            \"values\": {\n" +
                            "                \"displayCondition\": null,\n" +
                            "                \"columns\": false,\n" +
                            "                \"backgroundColor\": \"\",\n" +
                            "                \"columnsBackgroundColor\": \"\",\n" +
                            "                \"backgroundImage\": {\n" +
                            "                    \"url\": \"\",\n" +
                            "                    \"fullWidth\": true,\n" +
                            "                    \"repeat\": \"no-repeat\",\n" +
                            "                    \"size\": \"custom\",\n" +
                            "                    \"position\": \"center\"\n" +
                            "                },\n" +
                            "                \"padding\": \"0px\",\n" +
                            "                \"anchor\": \"\",\n" +
                            "                \"hideDesktop\": false,\n" +
                            "                \"_meta\": {\n" +
                            "                    \"htmlID\": \"u_row_5\",\n" +
                            "                    \"htmlClassNames\": \"u_row\"\n" +
                            "                },\n" +
                            "                \"selectable\": true,\n" +
                            "                \"draggable\": true,\n" +
                            "                \"duplicatable\": true,\n" +
                            "                \"deletable\": true,\n" +
                            "                \"hideable\": true\n" +
                            "            }\n" +
                            "        }],\n" +
                            "        \"values\": {\n" +
                            "            \"popupPosition\": \"center\",\n" +
                            "            \"popupWidth\": \"600px\",\n" +
                            "            \"popupHeight\": \"auto\",\n" +
                            "            \"borderRadius\": \"10px\",\n" +
                            "            \"contentAlign\": \"center\",\n" +
                            "            \"contentVerticalAlign\": \"center\",\n" +
                            "            \"contentWidth\": \"500px\",\n" +
                            "            \"fontFamily\": {\n" +
                            "                \"label\": \"Arial\",\n" +
                            "                \"value\": \"arial,helvetica,sans-serif\"\n" +
                            "            },\n" +
                            "            \"textColor\": \"#000000\",\n" +
                            "            \"popupBackgroundColor\": \"#FFFFFF\",\n" +
                            "            \"popupBackgroundImage\": {\n" +
                            "                \"url\": \"\",\n" +
                            "                \"fullWidth\": true,\n" +
                            "                \"repeat\": \"no-repeat\",\n" +
                            "                \"size\": \"cover\",\n" +
                            "                \"position\": \"center\"\n" +
                            "            },\n" +
                            "            \"popupOverlay_backgroundColor\": \"rgba(0, 0, 0, 0.1)\",\n" +
                            "            \"popupCloseButton_position\": \"top-right\",\n" +
                            "            \"popupCloseButton_backgroundColor\": \"#DDDDDD\",\n" +
                            "            \"popupCloseButton_iconColor\": \"#000000\",\n" +
                            "            \"popupCloseButton_borderRadius\": \"0px\",\n" +
                            "            \"popupCloseButton_margin\": \"0px\",\n" +
                            "            \"popupCloseButton_action\": {\n" +
                            "                \"name\": \"close_popup\",\n" +
                            "                \"attrs\": {\n" +
                            "                    \"onClick\": \"document.querySelector('.u-popup-container').style.display = 'none';\"\n" +
                            "                }\n" +
                            "            },\n" +
                            "            \"backgroundColor\": \"#ecf0f1\",\n" +
                            "            \"backgroundImage\": {\n" +
                            "                \"url\": \"\",\n" +
                            "                \"fullWidth\": true,\n" +
                            "                \"repeat\": \"no-repeat\",\n" +
                            "                \"size\": \"custom\",\n" +
                            "                \"position\": \"center\"\n" +
                            "            },\n" +
                            "            \"preheaderText\": \"\",\n" +
                            "            \"linkStyle\": {\n" +
                            "                \"body\": true,\n" +
                            "                \"linkColor\": \"#0000ee\",\n" +
                            "                \"linkHoverColor\": \"#0000ee\",\n" +
                            "                \"linkUnderline\": true,\n" +
                            "                \"linkHoverUnderline\": true\n" +
                            "            },\n" +
                            "            \"_meta\": {\n" +
                            "                \"htmlID\": \"u_body\",\n" +
                            "                \"htmlClassNames\": \"u_body\"\n" +
                            "            }\n" +
                            "        }\n" +
                            "    },\n" +
                            "    \"schemaVersion\": 13\n" +
                            "}"
            );
            Json threeColumn = new Json(
                    "Three Column",
                    "{\n" +
                            "    \"counters\": {\n" +
                            "        \"u_row\": 6,\n" +
                            "        \"u_column\": 10,\n" +
                            "        \"u_content_text\": 8,\n" +
                            "        \"u_content_image\": 5,\n" +
                            "        \"u_content_divider\": 5,\n" +
                            "        \"u_content_heading\": 5\n" +
                            "    },\n" +
                            "    \"body\": {\n" +
                            "        \"id\": \"yDm5nEcGZH\",\n" +
                            "        \"rows\": [{\n" +
                            "            \"id\": \"OMK-fKvau9\",\n" +
                            "            \"cells\": [1, 2],\n" +
                            "            \"columns\": [{\n" +
                            "                \"id\": \"IFQCIBmGFf\",\n" +
                            "                \"contents\": [{\n" +
                            "                    \"id\": \"_qTuqGjYgm\",\n" +
                            "                    \"type\": \"image\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"src\": {\n" +
                            "                            \"url\": \"https://cdn.tools.unlayer.com/image/placeholder.png\",\n" +
                            "                            \"width\": 800,\n" +
                            "                            \"height\": 200\n" +
                            "                        },\n" +
                            "                        \"textAlign\": \"center\",\n" +
                            "                        \"altText\": \"company logo\",\n" +
                            "                        \"action\": {\n" +
                            "                            \"name\": \"web\",\n" +
                            "                            \"values\": {\n" +
                            "                                \"href\": \"\",\n" +
                            "                                \"target\": \"_blank\"\n" +
                            "                            }\n" +
                            "                        },\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_image_1\",\n" +
                            "                            \"htmlClassNames\": \"u_content_image\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true\n" +
                            "                    }\n" +
                            "                }],\n" +
                            "                \"values\": {\n" +
                            "                    \"_meta\": {\n" +
                            "                        \"htmlID\": \"u_column_2\",\n" +
                            "                        \"htmlClassNames\": \"u_column\"\n" +
                            "                    },\n" +
                            "                    \"border\": {},\n" +
                            "                    \"padding\": \"0px\",\n" +
                            "                    \"borderRadius\": \"0px\",\n" +
                            "                    \"backgroundColor\": \"\"\n" +
                            "                }\n" +
                            "            }, {\n" +
                            "                \"id\": \"bBq9QbJk2Y\",\n" +
                            "                \"contents\": [{\n" +
                            "                    \"id\": \"oypjWeo-IM\",\n" +
                            "                    \"type\": \"heading\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"headingType\": \"h1\",\n" +
                            "                        \"fontSize\": \"23px\",\n" +
                            "                        \"textAlign\": \"center\",\n" +
                            "                        \"lineHeight\": \"140%\",\n" +
                            "                        \"linkStyle\": {\n" +
                            "                            \"inherit\": true,\n" +
                            "                            \"linkColor\": \"#0000ee\",\n" +
                            "                            \"linkHoverColor\": \"#0000ee\",\n" +
                            "                            \"linkUnderline\": true,\n" +
                            "                            \"linkHoverUnderline\": true\n" +
                            "                        },\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_heading_1\",\n" +
                            "                            \"htmlClassNames\": \"u_content_heading\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true,\n" +
                            "                        \"text\": \"<strong>Company name</strong>\"\n" +
                            "                    }\n" +
                            "                }],\n" +
                            "                \"values\": {\n" +
                            "                    \"_meta\": {\n" +
                            "                        \"htmlID\": \"u_column_3\",\n" +
                            "                        \"htmlClassNames\": \"u_column\"\n" +
                            "                    },\n" +
                            "                    \"border\": {},\n" +
                            "                    \"padding\": \"0px\",\n" +
                            "                    \"borderRadius\": \"0px\",\n" +
                            "                    \"backgroundColor\": \"\"\n" +
                            "                }\n" +
                            "            }],\n" +
                            "            \"values\": {\n" +
                            "                \"displayCondition\": null,\n" +
                            "                \"columns\": false,\n" +
                            "                \"backgroundColor\": \"\",\n" +
                            "                \"columnsBackgroundColor\": \"\",\n" +
                            "                \"backgroundImage\": {\n" +
                            "                    \"url\": \"\",\n" +
                            "                    \"fullWidth\": true,\n" +
                            "                    \"repeat\": \"no-repeat\",\n" +
                            "                    \"size\": \"custom\",\n" +
                            "                    \"position\": \"center\"\n" +
                            "                },\n" +
                            "                \"padding\": \"0px\",\n" +
                            "                \"anchor\": \"\",\n" +
                            "                \"hideDesktop\": false,\n" +
                            "                \"_meta\": {\n" +
                            "                    \"htmlID\": \"u_row_2\",\n" +
                            "                    \"htmlClassNames\": \"u_row\"\n" +
                            "                },\n" +
                            "                \"selectable\": true,\n" +
                            "                \"draggable\": true,\n" +
                            "                \"duplicatable\": true,\n" +
                            "                \"deletable\": true,\n" +
                            "                \"hideable\": true\n" +
                            "            }\n" +
                            "        }, {\n" +
                            "            \"id\": \"PLszH3ffQS\",\n" +
                            "            \"cells\": [1],\n" +
                            "            \"columns\": [{\n" +
                            "                \"id\": \"3KBPblSlUU\",\n" +
                            "                \"contents\": [{\n" +
                            "                    \"id\": \"bYUbRnoDpp\",\n" +
                            "                    \"type\": \"divider\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"width\": \"100%\",\n" +
                            "                        \"border\": {\n" +
                            "                            \"borderTopWidth\": \"1px\",\n" +
                            "                            \"borderTopStyle\": \"solid\",\n" +
                            "                            \"borderTopColor\": \"#BBBBBB\"\n" +
                            "                        },\n" +
                            "                        \"textAlign\": \"center\",\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_divider_1\",\n" +
                            "                            \"htmlClassNames\": \"u_content_divider\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true\n" +
                            "                    }\n" +
                            "                }, {\n" +
                            "                    \"id\": \"jCHeYNfduE\",\n" +
                            "                    \"type\": \"image\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"src\": {\n" +
                            "                            \"url\": \"https://cdn.tools.unlayer.com/image/placeholder.png\",\n" +
                            "                            \"width\": 800,\n" +
                            "                            \"height\": 200\n" +
                            "                        },\n" +
                            "                        \"textAlign\": \"center\",\n" +
                            "                        \"altText\": \"\",\n" +
                            "                        \"action\": {\n" +
                            "                            \"name\": \"web\",\n" +
                            "                            \"values\": {\n" +
                            "                                \"href\": \"\",\n" +
                            "                                \"target\": \"_blank\"\n" +
                            "                            }\n" +
                            "                        },\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_image_2\",\n" +
                            "                            \"htmlClassNames\": \"u_content_image\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true\n" +
                            "                    }\n" +
                            "                }, {\n" +
                            "                    \"id\": \"azF7O53i8i\",\n" +
                            "                    \"type\": \"divider\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"width\": \"100%\",\n" +
                            "                        \"border\": {\n" +
                            "                            \"borderTopWidth\": \"1px\",\n" +
                            "                            \"borderTopStyle\": \"solid\",\n" +
                            "                            \"borderTopColor\": \"#BBBBBB\"\n" +
                            "                        },\n" +
                            "                        \"textAlign\": \"center\",\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_divider_2\",\n" +
                            "                            \"htmlClassNames\": \"u_content_divider\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true\n" +
                            "                    }\n" +
                            "                }, {\n" +
                            "                    \"id\": \"HxUYi6mDxB\",\n" +
                            "                    \"type\": \"heading\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"headingType\": \"h3\",\n" +
                            "                        \"fontSize\": \"18px\",\n" +
                            "                        \"textAlign\": \"center\",\n" +
                            "                        \"lineHeight\": \"140%\",\n" +
                            "                        \"linkStyle\": {\n" +
                            "                            \"inherit\": true,\n" +
                            "                            \"linkColor\": \"#0000ee\",\n" +
                            "                            \"linkHoverColor\": \"#0000ee\",\n" +
                            "                            \"linkUnderline\": true,\n" +
                            "                            \"linkHoverUnderline\": true\n" +
                            "                        },\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_heading_2\",\n" +
                            "                            \"htmlClassNames\": \"u_content_heading\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true,\n" +
                            "                        \"text\": \"Your Title Goes Here\"\n" +
                            "                    }\n" +
                            "                }, {\n" +
                            "                    \"id\": \"y9LH_GHZyY\",\n" +
                            "                    \"type\": \"text\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"textAlign\": \"left\",\n" +
                            "                        \"lineHeight\": \"140%\",\n" +
                            "                        \"linkStyle\": {\n" +
                            "                            \"inherit\": true,\n" +
                            "                            \"linkColor\": \"#0000ee\",\n" +
                            "                            \"linkHoverColor\": \"#0000ee\",\n" +
                            "                            \"linkUnderline\": true,\n" +
                            "                            \"linkHoverUnderline\": true\n" +
                            "                        },\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_text_1\",\n" +
                            "                            \"htmlClassNames\": \"u_content_text\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true,\n" +
                            "                        \"text\": \"<p style=\\\"line-height: 140%;\\\">This is your welcome section. Here you can describe your business and the services it provides. Just click on this box to start editing. You will have access to all the formatting tools once you click inside the text area. This is a text field where you can add unlimited amount of text, divide it into sentences and paragraphs, and apply fonts to create titles or section breaks. Use this space to explain what your business does and the services it offers...</p>\"\n" +
                            "                    }\n" +
                            "                }, {\n" +
                            "                    \"id\": \"HJLGpIn-YV\",\n" +
                            "                    \"type\": \"divider\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"width\": \"100%\",\n" +
                            "                        \"border\": {\n" +
                            "                            \"borderTopWidth\": \"1px\",\n" +
                            "                            \"borderTopStyle\": \"solid\",\n" +
                            "                            \"borderTopColor\": \"#BBBBBB\"\n" +
                            "                        },\n" +
                            "                        \"textAlign\": \"center\",\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_divider_3\",\n" +
                            "                            \"htmlClassNames\": \"u_content_divider\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true\n" +
                            "                    }\n" +
                            "                }],\n" +
                            "                \"values\": {\n" +
                            "                    \"_meta\": {\n" +
                            "                        \"htmlID\": \"u_column_1\",\n" +
                            "                        \"htmlClassNames\": \"u_column\"\n" +
                            "                    },\n" +
                            "                    \"border\": {},\n" +
                            "                    \"padding\": \"0px\",\n" +
                            "                    \"backgroundColor\": \"\"\n" +
                            "                }\n" +
                            "            }],\n" +
                            "            \"values\": {\n" +
                            "                \"displayCondition\": null,\n" +
                            "                \"columns\": false,\n" +
                            "                \"backgroundColor\": \"\",\n" +
                            "                \"columnsBackgroundColor\": \"\",\n" +
                            "                \"backgroundImage\": {\n" +
                            "                    \"url\": \"\",\n" +
                            "                    \"fullWidth\": true,\n" +
                            "                    \"repeat\": \"no-repeat\",\n" +
                            "                    \"size\": \"custom\",\n" +
                            "                    \"position\": \"center\"\n" +
                            "                },\n" +
                            "                \"padding\": \"0px\",\n" +
                            "                \"anchor\": \"\",\n" +
                            "                \"hideDesktop\": false,\n" +
                            "                \"_meta\": {\n" +
                            "                    \"htmlID\": \"u_row_1\",\n" +
                            "                    \"htmlClassNames\": \"u_row\"\n" +
                            "                },\n" +
                            "                \"selectable\": true,\n" +
                            "                \"draggable\": true,\n" +
                            "                \"duplicatable\": true,\n" +
                            "                \"deletable\": true,\n" +
                            "                \"hideable\": true\n" +
                            "            }\n" +
                            "        }, {\n" +
                            "            \"id\": \"VTVTNEiidG\",\n" +
                            "            \"cells\": [1, 1, 1],\n" +
                            "            \"columns\": [{\n" +
                            "                \"id\": \"G5E7z0887a\",\n" +
                            "                \"contents\": [{\n" +
                            "                    \"id\": \"n4Oxl1w7ZG\",\n" +
                            "                    \"type\": \"image\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"src\": {\n" +
                            "                            \"url\": \"https://cdn.tools.unlayer.com/image/placeholder.png\",\n" +
                            "                            \"width\": 800,\n" +
                            "                            \"height\": 200\n" +
                            "                        },\n" +
                            "                        \"textAlign\": \"center\",\n" +
                            "                        \"altText\": \"\",\n" +
                            "                        \"action\": {\n" +
                            "                            \"name\": \"web\",\n" +
                            "                            \"values\": {\n" +
                            "                                \"href\": \"\",\n" +
                            "                                \"target\": \"_blank\"\n" +
                            "                            }\n" +
                            "                        },\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_image_3\",\n" +
                            "                            \"htmlClassNames\": \"u_content_image\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true\n" +
                            "                    }\n" +
                            "                }, {\n" +
                            "                    \"id\": \"xVnzHwTGDM\",\n" +
                            "                    \"type\": \"text\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"fontSize\": \"13px\",\n" +
                            "                        \"textAlign\": \"left\",\n" +
                            "                        \"lineHeight\": \"140%\",\n" +
                            "                        \"linkStyle\": {\n" +
                            "                            \"inherit\": true,\n" +
                            "                            \"linkColor\": \"#0000ee\",\n" +
                            "                            \"linkHoverColor\": \"#0000ee\",\n" +
                            "                            \"linkUnderline\": true,\n" +
                            "                            \"linkHoverUnderline\": true\n" +
                            "                        },\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_text_6\",\n" +
                            "                            \"htmlClassNames\": \"u_content_text\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true,\n" +
                            "                        \"text\": \"<p style=\\\"line-height: 140%;\\\">This area is for typing text. You can write as much as you'd like, breaking it into sentences and paragraphs, and even add fonts to make titles or separate chunks of text.</p>\"\n" +
                            "                    }\n" +
                            "                }],\n" +
                            "                \"values\": {\n" +
                            "                    \"_meta\": {\n" +
                            "                        \"htmlID\": \"u_column_8\",\n" +
                            "                        \"htmlClassNames\": \"u_column\"\n" +
                            "                    },\n" +
                            "                    \"border\": {},\n" +
                            "                    \"padding\": \"0px\",\n" +
                            "                    \"borderRadius\": \"0px\",\n" +
                            "                    \"backgroundColor\": \"\"\n" +
                            "                }\n" +
                            "            }, {\n" +
                            "                \"id\": \"vJOoozkp2_\",\n" +
                            "                \"contents\": [{\n" +
                            "                    \"id\": \"5BKXGI-JGm\",\n" +
                            "                    \"type\": \"image\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"src\": {\n" +
                            "                            \"url\": \"https://cdn.tools.unlayer.com/image/placeholder.png\",\n" +
                            "                            \"width\": 800,\n" +
                            "                            \"height\": 200\n" +
                            "                        },\n" +
                            "                        \"textAlign\": \"center\",\n" +
                            "                        \"altText\": \"\",\n" +
                            "                        \"action\": {\n" +
                            "                            \"name\": \"web\",\n" +
                            "                            \"values\": {\n" +
                            "                                \"href\": \"\",\n" +
                            "                                \"target\": \"_blank\"\n" +
                            "                            }\n" +
                            "                        },\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_image_4\",\n" +
                            "                            \"htmlClassNames\": \"u_content_image\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true\n" +
                            "                    }\n" +
                            "                }, {\n" +
                            "                    \"id\": \"X2LWwSwpZm\",\n" +
                            "                    \"type\": \"text\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"fontSize\": \"13px\",\n" +
                            "                        \"textAlign\": \"left\",\n" +
                            "                        \"lineHeight\": \"140%\",\n" +
                            "                        \"linkStyle\": {\n" +
                            "                            \"inherit\": true,\n" +
                            "                            \"linkColor\": \"#0000ee\",\n" +
                            "                            \"linkHoverColor\": \"#0000ee\",\n" +
                            "                            \"linkUnderline\": true,\n" +
                            "                            \"linkHoverUnderline\": true\n" +
                            "                        },\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_text_7\",\n" +
                            "                            \"htmlClassNames\": \"u_content_text\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true,\n" +
                            "                        \"text\": \"<p style=\\\"line-height: 140%;\\\">This area is for typing text. You can write as much as you'd like, breaking it into sentences and paragraphs, and even add fonts to make titles or separate chunks of text.</p>\"\n" +
                            "                    }\n" +
                            "                }],\n" +
                            "                \"values\": {\n" +
                            "                    \"_meta\": {\n" +
                            "                        \"htmlID\": \"u_column_9\",\n" +
                            "                        \"htmlClassNames\": \"u_column\"\n" +
                            "                    },\n" +
                            "                    \"border\": {},\n" +
                            "                    \"padding\": \"0px\",\n" +
                            "                    \"borderRadius\": \"0px\",\n" +
                            "                    \"backgroundColor\": \"\"\n" +
                            "                }\n" +
                            "            }, {\n" +
                            "                \"id\": \"6MmkH0y6e7\",\n" +
                            "                \"contents\": [{\n" +
                            "                    \"id\": \"gMS38rdRfY\",\n" +
                            "                    \"type\": \"image\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"src\": {\n" +
                            "                            \"url\": \"https://cdn.tools.unlayer.com/image/placeholder.png\",\n" +
                            "                            \"width\": 800,\n" +
                            "                            \"height\": 200\n" +
                            "                        },\n" +
                            "                        \"textAlign\": \"center\",\n" +
                            "                        \"altText\": \"\",\n" +
                            "                        \"action\": {\n" +
                            "                            \"name\": \"web\",\n" +
                            "                            \"values\": {\n" +
                            "                                \"href\": \"\",\n" +
                            "                                \"target\": \"_blank\"\n" +
                            "                            }\n" +
                            "                        },\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_image_5\",\n" +
                            "                            \"htmlClassNames\": \"u_content_image\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true\n" +
                            "                    }\n" +
                            "                }, {\n" +
                            "                    \"id\": \"G--1CaEXa8\",\n" +
                            "                    \"type\": \"text\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"fontSize\": \"13px\",\n" +
                            "                        \"textAlign\": \"left\",\n" +
                            "                        \"lineHeight\": \"140%\",\n" +
                            "                        \"linkStyle\": {\n" +
                            "                            \"inherit\": true,\n" +
                            "                            \"linkColor\": \"#0000ee\",\n" +
                            "                            \"linkHoverColor\": \"#0000ee\",\n" +
                            "                            \"linkUnderline\": true,\n" +
                            "                            \"linkHoverUnderline\": true\n" +
                            "                        },\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_text_8\",\n" +
                            "                            \"htmlClassNames\": \"u_content_text\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true,\n" +
                            "                        \"text\": \"<p style=\\\"line-height: 140%;\\\">This area is for typing text. You can write as much as you'd like, breaking it into sentences and paragraphs, and even add fonts to make titles or separate chunks of text.</p>\"\n" +
                            "                    }\n" +
                            "                }],\n" +
                            "                \"values\": {\n" +
                            "                    \"_meta\": {\n" +
                            "                        \"htmlID\": \"u_column_10\",\n" +
                            "                        \"htmlClassNames\": \"u_column\"\n" +
                            "                    },\n" +
                            "                    \"border\": {},\n" +
                            "                    \"padding\": \"0px\",\n" +
                            "                    \"borderRadius\": \"0px\",\n" +
                            "                    \"backgroundColor\": \"\"\n" +
                            "                }\n" +
                            "            }],\n" +
                            "            \"values\": {\n" +
                            "                \"displayCondition\": null,\n" +
                            "                \"columns\": false,\n" +
                            "                \"backgroundColor\": \"\",\n" +
                            "                \"columnsBackgroundColor\": \"\",\n" +
                            "                \"backgroundImage\": {\n" +
                            "                    \"url\": \"\",\n" +
                            "                    \"fullWidth\": true,\n" +
                            "                    \"repeat\": \"no-repeat\",\n" +
                            "                    \"size\": \"custom\",\n" +
                            "                    \"position\": \"center\"\n" +
                            "                },\n" +
                            "                \"padding\": \"0px\",\n" +
                            "                \"anchor\": \"\",\n" +
                            "                \"hideDesktop\": false,\n" +
                            "                \"_meta\": {\n" +
                            "                    \"htmlID\": \"u_row_6\",\n" +
                            "                    \"htmlClassNames\": \"u_row\"\n" +
                            "                },\n" +
                            "                \"selectable\": true,\n" +
                            "                \"draggable\": true,\n" +
                            "                \"duplicatable\": true,\n" +
                            "                \"deletable\": true,\n" +
                            "                \"hideable\": true\n" +
                            "            }\n" +
                            "        }, {\n" +
                            "            \"id\": \"b6ARaBBm4h\",\n" +
                            "            \"cells\": [1],\n" +
                            "            \"columns\": [{\n" +
                            "                \"id\": \"H7pE0U6qgT\",\n" +
                            "                \"contents\": [{\n" +
                            "                    \"id\": \"iUiuOps3_s\",\n" +
                            "                    \"type\": \"text\",\n" +
                            "                    \"values\": {\n" +
                            "                        \"containerPadding\": \"10px\",\n" +
                            "                        \"anchor\": \"\",\n" +
                            "                        \"fontSize\": \"12px\",\n" +
                            "                        \"textAlign\": \"center\",\n" +
                            "                        \"lineHeight\": \"140%\",\n" +
                            "                        \"linkStyle\": {\n" +
                            "                            \"inherit\": true,\n" +
                            "                            \"linkColor\": \"#0000ee\",\n" +
                            "                            \"linkHoverColor\": \"#0000ee\",\n" +
                            "                            \"linkUnderline\": true,\n" +
                            "                            \"linkHoverUnderline\": true\n" +
                            "                        },\n" +
                            "                        \"hideDesktop\": false,\n" +
                            "                        \"displayCondition\": null,\n" +
                            "                        \"_meta\": {\n" +
                            "                            \"htmlID\": \"u_content_text_5\",\n" +
                            "                            \"htmlClassNames\": \"u_content_text\"\n" +
                            "                        },\n" +
                            "                        \"selectable\": true,\n" +
                            "                        \"draggable\": true,\n" +
                            "                        \"duplicatable\": true,\n" +
                            "                        \"deletable\": true,\n" +
                            "                        \"hideable\": true,\n" +
                            "                        \"text\": \"<p style=\\\"line-height: 140%;\\\">Company street, Company city, Company country.</p>\"\n" +
                            "                    }\n" +
                            "                }],\n" +
                            "                \"values\": {\n" +
                            "                    \"_meta\": {\n" +
                            "                        \"htmlID\": \"u_column_7\",\n" +
                            "                        \"htmlClassNames\": \"u_column\"\n" +
                            "                    },\n" +
                            "                    \"border\": {},\n" +
                            "                    \"padding\": \"0px\",\n" +
                            "                    \"borderRadius\": \"0px\",\n" +
                            "                    \"backgroundColor\": \"#ced4d9\"\n" +
                            "                }\n" +
                            "            }],\n" +
                            "            \"values\": {\n" +
                            "                \"displayCondition\": null,\n" +
                            "                \"columns\": false,\n" +
                            "                \"backgroundColor\": \"\",\n" +
                            "                \"columnsBackgroundColor\": \"\",\n" +
                            "                \"backgroundImage\": {\n" +
                            "                    \"url\": \"\",\n" +
                            "                    \"fullWidth\": true,\n" +
                            "                    \"repeat\": \"no-repeat\",\n" +
                            "                    \"size\": \"custom\",\n" +
                            "                    \"position\": \"center\"\n" +
                            "                },\n" +
                            "                \"padding\": \"0px\",\n" +
                            "                \"anchor\": \"\",\n" +
                            "                \"hideDesktop\": false,\n" +
                            "                \"_meta\": {\n" +
                            "                    \"htmlID\": \"u_row_5\",\n" +
                            "                    \"htmlClassNames\": \"u_row\"\n" +
                            "                },\n" +
                            "                \"selectable\": true,\n" +
                            "                \"draggable\": true,\n" +
                            "                \"duplicatable\": true,\n" +
                            "                \"deletable\": true,\n" +
                            "                \"hideable\": true\n" +
                            "            }\n" +
                            "        }],\n" +
                            "        \"values\": {\n" +
                            "            \"popupPosition\": \"center\",\n" +
                            "            \"popupWidth\": \"600px\",\n" +
                            "            \"popupHeight\": \"auto\",\n" +
                            "            \"borderRadius\": \"10px\",\n" +
                            "            \"contentAlign\": \"center\",\n" +
                            "            \"contentVerticalAlign\": \"center\",\n" +
                            "            \"contentWidth\": \"500px\",\n" +
                            "            \"fontFamily\": {\n" +
                            "                \"label\": \"Arial\",\n" +
                            "                \"value\": \"arial,helvetica,sans-serif\"\n" +
                            "            },\n" +
                            "            \"textColor\": \"#000000\",\n" +
                            "            \"popupBackgroundColor\": \"#FFFFFF\",\n" +
                            "            \"popupBackgroundImage\": {\n" +
                            "                \"url\": \"\",\n" +
                            "                \"fullWidth\": true,\n" +
                            "                \"repeat\": \"no-repeat\",\n" +
                            "                \"size\": \"cover\",\n" +
                            "                \"position\": \"center\"\n" +
                            "            },\n" +
                            "            \"popupOverlay_backgroundColor\": \"rgba(0, 0, 0, 0.1)\",\n" +
                            "            \"popupCloseButton_position\": \"top-right\",\n" +
                            "            \"popupCloseButton_backgroundColor\": \"#DDDDDD\",\n" +
                            "            \"popupCloseButton_iconColor\": \"#000000\",\n" +
                            "            \"popupCloseButton_borderRadius\": \"0px\",\n" +
                            "            \"popupCloseButton_margin\": \"0px\",\n" +
                            "            \"popupCloseButton_action\": {\n" +
                            "                \"name\": \"close_popup\",\n" +
                            "                \"attrs\": {\n" +
                            "                    \"onClick\": \"document.querySelector('.u-popup-container').style.display = 'none';\"\n" +
                            "                }\n" +
                            "            },\n" +
                            "            \"backgroundColor\": \"#ecf0f1\",\n" +
                            "            \"backgroundImage\": {\n" +
                            "                \"url\": \"\",\n" +
                            "                \"fullWidth\": true,\n" +
                            "                \"repeat\": \"no-repeat\",\n" +
                            "                \"size\": \"custom\",\n" +
                            "                \"position\": \"center\"\n" +
                            "            },\n" +
                            "            \"preheaderText\": \"\",\n" +
                            "            \"linkStyle\": {\n" +
                            "                \"body\": true,\n" +
                            "                \"linkColor\": \"#0000ee\",\n" +
                            "                \"linkHoverColor\": \"#0000ee\",\n" +
                            "                \"linkUnderline\": true,\n" +
                            "                \"linkHoverUnderline\": true\n" +
                            "            },\n" +
                            "            \"_meta\": {\n" +
                            "                \"htmlID\": \"u_body\",\n" +
                            "                \"htmlClassNames\": \"u_body\"\n" +
                            "            }\n" +
                            "        }\n" +
                            "    },\n" +
                            "    \"schemaVersion\": 13\n" +
                            "}"
            );

            repository.saveAll(
                    List.of(Blank,oneColumn,twoColumn,threeColumn)
            );
        };
    }
}

