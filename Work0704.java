package day0706;
import java.util.Calendar;

public class Work0704 {
	private Calendar cal;

	public Work0704() {
		cal = Calendar.getInstance();
	}

	public StringBuilder calendar() {
		StringBuilder sb = new StringBuilder();

		// 1일을 출력하기 전 공백 만들기
		for (int j = 0; j < cal.get(Calendar.DAY_OF_WEEK); j++) {
			sb.append("\t");
		} // end for

		int tempDay = 1;
		while (tempDay <= cal.getActualMaximum(Calendar.DAY_OF_MONTH)) { // 이번달의 마지막 날
			cal.set(Calendar.DAY_OF_MONTH, tempDay);

			sb.append(tempDay).append("   ");
			switch (cal.get(Calendar.DAY_OF_WEEK)) { // 같은지를 물어볼 때는 switch case를 써라
			case Calendar.SATURDAY:
				sb.append("\n");
			} // end switch
			tempDay++;
		} // end while

		return sb;
	}// calendar

	// 2번
	public String[][] yearMonth(int year, int month) {
		cal.set(year, month - 1, 1);

		// 매 월마다 행이 다르다. 다른 행을 얻는다.
		int monthRowCnt = 0;
		monthRowCnt = cal.getActualMaximum(Calendar.WEEK_OF_MONTH);
		String[][] calendar = new String[monthRowCnt][cal.getActualMaximum(Calendar.DAY_OF_WEEK)];

		int tempDay = 1;
		for (int i = 0; i < cal.getActualMaximum(Calendar.WEEK_OF_MONTH); i++) {
			for (int j = 0; j < Calendar.SATURDAY; j++) {
				if (i == 0 && cal.get(Calendar.DAY_OF_WEEK) > j + 1) {
					calendar[i][j] = "  ";
				} else if (tempDay > cal.getActualMaximum(Calendar.DAY_OF_MONTH)) {
					calendar[i][j] = " ";

				} else {
					calendar[i][j] = String.format("%2d", tempDay); // 출력이아니라, 이 형태로 값을 받을때 쓴다. format
					tempDay++;

				} // end else
			} // end for
		} // end for
		return calendar;
	}// end yearMonth

}// class