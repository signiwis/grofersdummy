/**
 *
 */
package de.hybris.merchandise.initialdata.dataimport.impl;

import de.hybris.platform.commerceservices.dataimport.impl.SampleDataImportService;


/**
 * @author lenovo
 *
 */
public class MerchandiseDataImportService extends SampleDataImportService
{

	//CSVReader csv = new CSVReader("input.csv", "utf-8");

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.commerceservices.dataimport.impl.SampleDataImportService#importProductCatalog(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	protected void importProductCatalog(final String extensionName, final String productCatalogName)
	{
		// YTODO Auto-generated method stub
		super.importProductCatalog(extensionName, productCatalogName);
		getSetupImpexService()
				.importImpexFile(String.format("/%s/import/sampledata/productCatalogs/%sProductCatalog/pricegroups.impex",
						extensionName, productCatalogName), false);
	}
}
