/**
 *
 */
package de.hybris.merchandise.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author lenovo
 *
 */
@Controller
@Scope("tenant")
@RequestMapping("/offers")
public class OffersPageController extends AbstractPageController
{
	private static final String OFFERS_CMS_PAGE = "offersCMSPage";


	@RequestMapping(method = RequestMethod.GET)
	public String getoffers(final Model model) throws CMSItemNotFoundException
	{
		final ContentPageModel offersCMSPage = getContentPageForLabelOrId(OFFERS_CMS_PAGE);
		storeCmsPageInModel(model, offersCMSPage);
		setUpMetaDataForContentPage(model, offersCMSPage);
		return getViewForPage(model);
	}



}
