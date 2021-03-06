/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.contrib.migrator.job;

import org.xwiki.job.AbstractJob;

/**
 * Define a bulk migration job.
 *
 * A bulk migration job will run multiple migrations at once, though nested {@link AbstractMigrationJob}.
 *
 * @version $Id$
 * @since 1.0
 */
public abstract class AbstractBulkMigrationJob
        extends AbstractJob<AbstractBulkMigrationJobRequest, AbstractBulkMigrationJobStatus>
{
    /**
     * The type of the job ; also used as a job identifier.
     */
    public static final String JOB_TYPE = "bulkMigrationJob";

    @Override
    public final String getType()
    {
        return JOB_TYPE;
    }
}
