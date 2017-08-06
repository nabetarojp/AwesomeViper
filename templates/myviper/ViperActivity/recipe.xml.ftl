<?xml version="1.0"?>
<recipe>

    <instantiate from="src/app_package/ViperActivity.java.ftl"
                 to="${escapeXmlAttribute(srcOut)}/${className}Activity.java"/>
    <instantiate from="src/app_package/ViperActivityComponent.java.ftl"
                 to="${escapeXmlAttribute(srcOut)}/${className}ActivityComponent.java"/>
    <instantiate from="res/layout/activity_viper.xml.ftl"
                 to="${escapeXmlAttribute(resOut)}/layout/activity${className?replace("[A-Z]", "_$0", "r")?lower_case}.xml" />
    <instantiate from="src/app_package/ViperActivityModule.java.ftl"
                 to="${escapeXmlAttribute(srcOut)}/${className}ActivityModule.java"/>
    <instantiate from="src/app_package/ViperActivityObjectModule.java.ftl"
                 to="${escapeXmlAttribute(srcOut)}/${className}ActivityObjectModule.java"/>
    <instantiate from="src/app_package/ViperPresenter.java.ftl"
                 to="${escapeXmlAttribute(srcOut)}/${className}Presenter.java"/>
    <#include "../ViperContract/recipe_contract.xml.ftl" />

    <open file="${srcOut}/${className}Activity.java"/>
    <open file="${resOut}/layout/activity${className?replace("[A-Z]", "_$0", "r")?lower_case}.xml"/>
</recipe>
