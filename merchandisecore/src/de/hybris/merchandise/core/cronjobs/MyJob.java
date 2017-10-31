/**
 *
 */
package de.hybris.merchandise.core.cronjobs;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.JobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import org.apache.log4j.Logger;


/**
 * @author lenovo
 *
 */
public class MyJob implements JobPerformable<CronJobModel>
{


	private static final Logger LOG = Logger.getLogger(MyJob.class);

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.cronjob.JobPerformable#perform(de.hybris.platform.cronjob.model.CronJobModel)
	 */
	@Override
	public PerformResult perform(final CronJobModel model)
	{
		isPerformable();
		LOG.info("Cronjob Running successful");
		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.cronjob.JobPerformable#isAbortable()
	 */
	@Override
	public boolean isAbortable()
	{

		return true;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.cronjob.JobPerformable#isPerformable()
	 */
	@Override
	public boolean isPerformable()
	{
		// YTODO Auto-generated method stub
		return true;
	}

}
