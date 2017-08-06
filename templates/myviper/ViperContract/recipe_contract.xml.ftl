<recipe folder="root://myviper/ViperContract">

    <instantiate from="root/src/app_package/ViperContract.java.ftl"
                 to="${escapeXmlAttribute(srcOut)}/${className}Contract.java"/>
    <instantiate from="root/src/app_package/ViperViewModel.java.ftl"
                 to="${escapeXmlAttribute(srcOut)}/${className}ViewModel.java"/>
    <instantiate from="root/src/app_package/ViperInteractor.java.ftl"
                 to="${escapeXmlAttribute(srcOut)}/${className}Interactor.java"/>
    <instantiate from="root/src/app_package/ViperRouter.java.ftl"
                 to="${escapeXmlAttribute(srcOut)}/${className}Router.java"/>
</recipe>
