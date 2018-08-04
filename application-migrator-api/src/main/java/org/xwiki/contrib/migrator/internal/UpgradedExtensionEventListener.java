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
package org.xwiki.contrib.migrator.internal;

import javax.inject.Named;
import javax.inject.Singleton;

import org.xwiki.component.annotation.Component;
import org.xwiki.extension.event.ExtensionUpgradedEvent;
import org.xwiki.observation.AbstractEventListener;
import org.xwiki.observation.event.Event;

/**
 * This listener aims to trigger an eventual XClass migration during an extension upgrade.
 *
 * @version $Id$
 * @since 1.0
 */
@Component
@Singleton
@Named(UpgradedExtensionEventListener.LISTENER_NAME)
public class UpgradedExtensionEventListener extends AbstractEventListener
{
    /**
     * The listener name.
     */
    public static final String LISTENER_NAME = "UpgradedExtensionEventListener";

    /**
     * Build a new {@link UpgradedExtensionEventListener}.
     */
    public UpgradedExtensionEventListener()
    {
        super(LISTENER_NAME, new ExtensionUpgradedEvent());
    }

    @Override
    public void onEvent(Event event, Object source, Object data)
    {

    }
}
