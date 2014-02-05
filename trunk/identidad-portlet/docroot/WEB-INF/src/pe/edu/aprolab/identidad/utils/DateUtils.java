package pe.edu.aprolab.identidad.utils;

import java.util.Date;

import com.liferay.portal.ContactBirthdayException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.util.PortalUtil;

public class DateUtils {
	
	public static Date getBirthday(
			int birthdayMonth, int birthdayDay, int birthdayYear)
		throws PortalException {

		Date birthday = PortalUtil.getDate(
			birthdayMonth, birthdayDay, birthdayYear,
			ContactBirthdayException.class);

		Date now = new Date();

		if (birthday.after(now)) {
			throw new ContactBirthdayException();
		}

		return birthday;
	}
}
