package de.codeset.gwt.notification.api.client.eventing.show;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

/**
 * @author Marcel Konopka
 *
 * @see <a href="https://github.com/MarZl/notification-api">https://github.com/MarZl/notification-api</a>
 * 
 * A widget that implements this interface provides registration for
 * {@link NotificationShowHandler} instances.
 */
public interface HasNotificationShowHandlers extends HasHandlers {
	  /**
	   * Adds a {@link NotificationShowEvent} handler.
	   * 
	   * @param handler the show handler
	   * @return {@link HandlerRegistration} used to remove this handler
	   */
	  HandlerRegistration addShowHandler(NotificationShowHandler handler);
}
