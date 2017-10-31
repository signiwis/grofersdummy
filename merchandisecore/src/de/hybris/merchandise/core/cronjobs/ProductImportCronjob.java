/**
 *
 */
/*
 * package de.hybris.merchandise.core.cronjobs;
 * 
 * import de.hybris.platform.commerceservices.dataimport.impl.SampleDataImportService; import
 * de.hybris.platform.cronjob.enums.CronJobResult; import de.hybris.platform.cronjob.enums.CronJobStatus; import
 * de.hybris.platform.cronjob.model.CronJobModel; import de.hybris.platform.servicelayer.cronjob.JobPerformable; import
 * de.hybris.platform.servicelayer.cronjob.PerformResult;
 * 
 * import org.apache.log4j.Logger;
 * 
 * 
 *//**
   * @author lenovo
   *
   *//*
	  * public class ProductImportCronjob extends SampleDataImportService implements JobPerformable<CronJobModel> {
	  * 
	  * private final static Logger LOG = Logger.getLogger(ProductImportCronjob.class.getName());
	  * 
	  * 
	  * 
	  * (non-Javadoc)
	  *
	  * @see de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable#perform(de.hybris.platform.cronjob.model.
	  * CronJobModel)
	  * 
	  * @Override public PerformResult perform(final CronJobModel model) {
	  * 
	  * isAbortable();
	  * 
	  * try {
	  * 
	  * getSetupImpexService()
	  * .importImpexFile(String.format("/%s/import/sampledata/productCatalogs/%sProductCatalog/customproducts.impex",
	  * "merchandiseinitialdata", "hybrisProductCatalog"), false); } catch (final Exception e) {
	  * LOG.error("could not import products from productCatalog " + e); }
	  * 
	  * return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED); }
	  * 
	  * 
	  * @Override public boolean isAbortable() { // YTODO Auto-generated method stub return false; }
	  * 
	  * 
	  * (non-Javadoc)
	  *
	  * @see de.hybris.platform.servicelayer.cronjob.JobPerformable#isPerformable()
	  * 
	  * @Override public boolean isPerformable() { // YTODO Auto-generated method stub return false; }
	  * 
	  * 
	  * (non-Javadoc)
	  *
	  * @see de.hybris.platform.commerceservices.dataimport.impl.SampleDataImportService#importProductCatalog(java.lang.
	  * String, java.lang.String)
	  * 
	  * @Override protected void importProductCatalog(final String extensionName, final String productCatalogName) {
	  * 
	  * super.importProductCatalog(extensionName, productCatalogName); getSetupImpexService()
	  * .importImpexFile(String.format("/%s/import/sampledata/productCatalogs/%sProductCatalog/pricegroups.impex",
	  * extensionName, productCatalogName), false);
	  * 
	  * }
	  * 
	  * 
	  * }
	  */