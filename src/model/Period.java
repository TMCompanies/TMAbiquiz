package model;

public enum Period
{
	//p1 = Player 1 = challenged Person (picks the first subject and starts)
	//p2 = Player 2 = Challenger 
	//rx = round x (0-4 possible)
<<<<<<< HEAD
	r0_p1a_cc, //p1 accepted the challenge, the competition was created; waiting for p1 to ask for the selectable subjects
	r0_p1a4ss_w4d, //p1 asked for the 2 selectable subjects; waiting for his decision
	r0_p1ss_w4nqr, //p1 selected a subject; waiting for NextQuestionsCRequest by p1
	r0_p1rq_w4a, //p1 requested the 3 questions; waiting for his answers
	r0_p1taffr_p2giapq,  //p1 transmitted his answers and finished the first round; p2 is going to get informed and asked to play the 3 questions
	r0_p2rq_w4a, //p2 requested the 3 questions; waiting for his answers
	r0_p2taffr_w4gssrsr1, //p2 transmitted his answers and finished the first round; waiting for GetSelectableSubjectsRequest to start round 1
	r1_p2a4ss_w4d, //round 1 started; p2 asked for the 2 selectable subjects; waiting for his decision
	r1_p2ss_w4nqr, //p2 selected a subject; waiting for NextQuestionsCRequest by p2
	r1_p2rq_w4a, //p2 requested the 3 questions; waiting for his answers
	r1_p2tafsr_p1giapq, //p2 transmitted his answers and finished the second round; p1 is going to get informed and asked to play the 3 questions
	r1_p1rq_w4a, //p1 requested the 3 questions; waiting for his answers
	r1_p1tafsr_w4gssrsr2, //p1 transmitted his answers and finished the second round; waiting for GetSelectableSubjectsRequest to start round 2
	r2_p1a4ss_w4d, //round 2 started; p1 asked for the 2 selectable subjects; waiting for his decision
	r2_p1ss_w4nqr, //p1 selected a subject; waiting for NextQuestionsCRequest by p1
	r2_p1rq_w4a, //p1 requested the 3 questions; waiting for his answers
	r2_p1taftr_p2giapq, //p1 transmitted his answers and finished the third round; p2 is going to get informed and asked to play the 3 questions
	r2_p2rq_w4a, //p2 requested the 3 questions; waiting for his answers
	r2_p2taftr_w4gssrsr3, //p2 transmitted his answers and finished the third round; waiting for GetSelectableSubjectsRequest to start round 3
	r3_p2a4ss_w4d, //round 3 started; p2 asked for the 2 selectable subjects; waiting for his decision
	r3_p2ss_w4nqr, //p2 selected a subject; waiting for NextQuestionsCRequest by p2
	r3_p2rq_w4a,  //p2 requested the 3 questions; waiting for his answers
	r3_p2taftr_p1giapq, //p2 transmitted his answers and finished the fourth round; p1 is going to get informed and asked to play the 3 questions
	r3_p1rq_w4a, //p1 requested the 3 questions; waiting for his answers
	r3_p1taffr_w4gssrsr4, //p1 transmitted his answers and finished the fourth round; waiting for GetSelectableSubjectsRequest to start round 4
	r4_p1a4ss_w4d, //round 4 started; p1 asked for the 2 selectable subjects; waiting for his decision
	r4_p1ss_w4nqr, //p1 selected a subject; waiting for NextQuestionsCRequest by p1
	r4_p1rq_w4a, //p1 requested the 3 questions; waiting for his answers
	r4_p1tafsr_p2giapq, //p1 transmitted his answers and finished the fifth round; p2 is going to get informed and asked to play the 3 questions
	r4_p2rq_w4a, //p2 requested the 3 questions; waiting for his answers
	r4_p2taffr_gf; //p2 transmitted his answers and finished the fifth round; game finished, both players are going to get informed and offered, to make another competition
		
=======
	r0_p1a_cc(0), //p1 accepted the challenge, the competition was created; waiting for p1 to ask for the selectable subjects
	r0_p1a4ss_w4d(1), //p1 asked for the 2 selectable subjects; waiting for his decision
	r0_p1ss_w4nqr(2), //p1 selected a subject; waiting for NextQuestionsCRequest by p1
	r0_p1rq_w4a(3), //p1 requested the 3 questions; waiting for his answers
	r0_p1taffr_p2giapq(4),  //p1 transmitted his answers and finished the first round; p2 is going to get informed and asked to play the 3 questions
	r0_p2rq_w4a(5), //p2 requested the 3 questions; waiting for his answers
	r0_p2taffr_w4gssrsr1(6), //p2 transmitted his answers and finished the first round; waiting for GetSelectableSubjectsRequest to start round 1
	r1_p2a4ss_w4d(7), //round 1 started; p2 asked for the 2 selectable subjects; waiting for his decision
	r1_p2ss_w4nqr(8), //p2 selected a subject; waiting for NextQuestionsCRequest by p2
	r1_p2rq_w4a(9), //p2 requested the 3 questions; waiting for his answers
	r1_p2tafsr_p1giapq(10), //p2 transmitted his answers and finished the second round; p1 is going to get informed and asked to play the 3 questions
	r1_p1rq_w4a(11), //p1 requested the 3 questions; waiting for his answers
	r1_p1tafsr_w4gssrsr2(12), //p1 transmitted his answers and finished the second round; waiting for GetSelectableSubjectsRequest to start round 2
	r2_p1a4ss_w4d(13), //round 2 started; p1 asked for the 2 selectable subjects; waiting for his decision
	r2_p1ss_w4nqr(14), //p1 selected a subject; waiting for NextQuestionsCRequest by p1
	r2_p1rq_w4a(15), //p1 requested the 3 questions; waiting for his answers
	r2_p1taftr_p2giapq(16), //p1 transmitted his answers and finished the third round; p2 is going to get informed and asked to play the 3 questions
	r2_p2rq_w4a(17), //p2 requested the 3 questions; waiting for his answers
	r2_p2taftr_w4gssrsr3(18), //p2 transmitted his answers and finished the third round; waiting for GetSelectableSubjectsRequest to start round 3
	r3_p2a4ss_w4d(19), //round 3 started; p2 asked for the 2 selectable subjects; waiting for his decision
	r3_p2ss_w4nqr(20), //p2 selected a subject; waiting for NextQuestionsCRequest by p2
	r3_p2rq_w4a(21),  //p2 requested the 3 questions; waiting for his answers
	r3_p2taftr_p1giapq(22), //p2 transmitted his answers and finished the fourth round; p1 is going to get informed and asked to play the 3 questions
	r3_p1rq_w4a(23), //p1 requested the 3 questions; waiting for his answers
	r3_p1taffr_w4gssrsr4(24), //p1 transmitted his answers and finished the fourth round; waiting for GetSelectableSubjectsRequest to start round 4
	r4_p1a4ss_w4d(25), //round 4 started; p1 asked for the 2 selectable subjects; waiting for his decision
	r4_p1ss_w4nqr(26), //p1 selected a subject; waiting for NextQuestionsCRequest by p1
	r4_p1rq_w4a(27), //p1 requested the 3 questions; waiting for his answers
	r4_p1tafsr_p2giapq(28), //p1 transmitted his answers and finished the fifth round; p2 is going to get informed and asked to play the 3 questions
	r4_p2rq_w4a(29), //p2 requested the 3 questions; waiting for his answers
	r4_p2taffr_gf(30); //p2 transmitted his answers and finished the fifth round; game finished, both players are going to get informed and offered, to make another competition
		
	private int id;
	
	private Period(int id)
	{
		this.id = id;
	}
	
	public static Period getPeriodById(int id)
	{
		for(Period p : Period.values())
		{
			if(p.id == id)
				return p;
		}
		
		return null;
	}
	
	public int getId(Period p)
	{
		return id;
	}
>>>>>>> 3cd9fb25b6b7750533ed447e0f56f1528a217fb8
}
