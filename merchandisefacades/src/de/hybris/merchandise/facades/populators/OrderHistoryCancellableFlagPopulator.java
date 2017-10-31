/**
 *
 */
package de.hybris.merchandise.facades.populators;

import de.hybris.platform.commercefacades.order.data.OrderHistoryData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;


/**
 * @author lenovo
 *
 */
public class OrderHistoryCancellableFlagPopulator implements Populator<OrderModel, OrderHistoryData>
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final OrderModel source, final OrderHistoryData target) throws ConversionException
	{

		target.setCancellable(true);
	}



}
