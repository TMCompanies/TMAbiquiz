package model;

public enum Period
{
	//p1 = Player 1 = challenged Person (picks the first subject and starts)
	//p2 = Player 2 = Challenger 
	//rx = round x (0-4 possible)
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
		
}
