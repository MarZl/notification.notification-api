package de.codeset.gwt.client.notification.eventing.click;

import com.google.gwt.event.shared.GwtEvent;

/**
 * @author MarZl 
 *
 * @see <a href="https://github.com/MarZl/notification-api">https://github.com/MarZl/notification-api</a>
 * 
 */
public class NotificationClickEvent extends GwtEvent<NotificationClickHandler> {

	private static final Type<NotificationClickHandler> TYPE = new Type<NotificationClickHandler>();

	public static Type<NotificationClickHandler> getType() {
		return TYPE;
	}

	@Override
	public Type<NotificationClickHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(NotificationClickHandler handler) {
		handler.onClick(this);
	}
}