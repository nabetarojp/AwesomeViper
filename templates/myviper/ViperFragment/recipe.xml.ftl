<?xml version="1.0"?>
<recipe>

    <instantiate from="src/app_package/ViperFragment.java.ftl"
                 to="${escapeXmlAttribute(srcOut)}/${className}Fragment.java"/>
    <instantiate from="src/app_package/ViperFragmentComponent.java.ftl"
                 to="${escapeXmlAttribute(srcOut)}/${className}FragmentComponent.java"/>
    <instantiate from="res/layout/fragment_viper.xml.ftl"
                 to="${escapeXmlAttribute(resOut)}/layout/fragment${className?replace("[A-Z]", "_$0", "r")?lower_case}.xml" />
    <instantiate from="src/app_package/ViperFragmentModule.java.ftl"
                 to="${escapeXmlAttribute(srcOut)}/${className}FragmentModule.java"/>
    <instantiate from="src/app_package/ViperFragmentObjectModule.java.ftl"
                 to="${escapeXmlAttribute(srcOut)}/${className}FragmentObjectModule.java"/>
    <instantiate from="src/app_package/ViperPresenter.java.ftl"
                 to="${escapeXmlAttribute(srcOut)}/${className}Presenter.java"/>
    <#include "../ViperContract/recipe_contract.xml.ftl" />

    <open file="${srcOut}/${className}Fragment.java"/>
    <open file="${resOut}/layout/fragment${className?replace("[A-Z]", "_$0", "r")?lower_case}.xml"/>
</recipe>
