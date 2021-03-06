package natlab.tame.builtin.isComplexInfoProp;

import java.util.ArrayList;
import beaver.*;
import java.util.*;
import natlab.tame.builtin.isComplexInfoProp.ast.*;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.2
 * from the grammar specification "isComplexInfo.grammar".
 */
public class isComplexInfoPropParser extends Parser {
	static public class Terminals {
		static public final short EOF = 0;
		static public final short ANY = 1;
		static public final short COMPLEX = 2;
		static public final short REAL = 3;
		static public final short QUESTION = 4;
		static public final short NUMBER = 5;
		static public final short PLUS = 6;
		static public final short MULT = 7;
		static public final short LT = 8;
		static public final short GT = 9;
		static public final short LTE = 10;
		static public final short GTE = 11;
		static public final short EQEQ = 12;
		static public final short NEQ = 13;
		static public final short COLON = 14;
		static public final short COMMA = 15;
		static public final short ID = 16;
		static public final short LCURLY = 17;
		static public final short RCURLY = 18;
		static public final short OROR = 19;
		static public final short ARROW = 20;
		static public final short LAND = 21;
		static public final short LOR = 22;
	}

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9nrarbJ4q4KXSzaX0HP4a38X2n0oAQ8eeBAYrLMOQbbMQ8FycfPvPFb#kgB$z9zNn5ttBV" +
		"ZcJiT74dIgQ$lqgSdTthw0hY6QQJ4FimR#z65JQ8FQIJGZm7Um2JAc485LTGw#hq8aCCOgN" +
		"sPS1yQs1pbaDHgNVaPosSm11yzMgqZxnIjyx3qMqmVnIEAHsFnDBPY3jjKSGdT64GME#Njm" +
		"6xiaNANAKiee8W9Z7E5B$c2p$cCJx4TizWhVLgCgOAG4iQDGEzUqVEIgYrbDVRg9Fex#bbu" +
		"EYKVqBwYxPlGgKIvgbOpoWzQlYXls5OpgYnIjCvPgGBJH$60ucmi3glEMSK5dKvEsY5vPPt" +
		"Eg9GvKnQa2lG5Q#BVBz2N2bJdmdNOE23gug2BZuifaXzbPyASowUQVYpN8#R5efWLXyHXSQ" +
		"IDzeHOSlxvMFw2k2WkYSlYYhWQMrzsjk9iMfno$aYR$pctCQTtMN5sDQRhSpOVqwsrUTvHP" +
		"#V2TtL#U6R7scYNO$Msh7T2Oz7PCyrOd7R#oJRwinlY1RZ1tpR$4e$ua0zudn$udkyG6xpD" +
		"U$pCJrpZBTxb7MLUyyb$YfjyhFa7l$ERnReBVCDLlk9RVkKN$kGVfHkwDvww9CHNr$Zg6q$" +
		"ukfUUIApRi3kQvErcU#kK3LztDg6RwHc53jH4rV3LGPuZeLvAYMwHT7Ifppmq$W8NxgGq");

	private final Action[] actions;

	public isComplexInfoPropParser() {
		super(PARSING_TABLES);
		actions = new Action[] {
			Action.RETURN,	// [0] $goal = caselist
			new Action() {	// [1] caselist = case.cs
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_cs = _symbols[offset + 1];
					final ICCase cs = (ICCase) _symbol_cs.value;
					 return new ICCaselist(null, cs);
				}
			},
			new Action() {	// [2] caselist = caselist.csl OROR case.cs
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_csl = _symbols[offset + 1];
					final ICCaselist csl = (ICCaselist) _symbol_csl.value;
					final Symbol _symbol_cs = _symbols[offset + 3];
					final ICCase cs = (ICCase) _symbol_cs.value;
					 return new ICCaselist(csl, cs);
				}
			},
			new Action() {	// [3] case = inputValueList.ivl ARROW outputValueList.ovl
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_ivl = _symbols[offset + 1];
					final ICinputValueList ivl = (ICinputValueList) _symbol_ivl.value;
					final Symbol _symbol_ovl = _symbols[offset + 3];
					final ICoutputValueList ovl = (ICoutputValueList) _symbol_ovl.value;
					 return new ICCase(ivl, ovl);
				}
			},
			new Action() {	// [4] inputValueList = inputValue.iv
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_iv = _symbols[offset + 1];
					final ICAbstractValue iv = (ICAbstractValue) _symbol_iv.value;
					 return new ICinputValueList(null, iv);
				}
			},
			new Action() {	// [5] inputValueList = inputValueList.ivl COMMA inputValue.iv
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_ivl = _symbols[offset + 1];
					final ICinputValueList ivl = (ICinputValueList) _symbol_ivl.value;
					final Symbol _symbol_iv = _symbols[offset + 3];
					final ICAbstractValue iv = (ICAbstractValue) _symbol_iv.value;
					 return new ICinputValueList (ivl, iv);
				}
			},
			new Action() {	// [6] inputValue = isComplexValue.xv
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_xv = _symbols[offset + 1];
					final ICAbstractValue xv = (ICAbstractValue) _symbol_xv.value;
					 return new ICComplexValue (xv);
				}
			},
			new Action() {	// [7] inputValue = isComplexValue.xv QOp.qop
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_xv = _symbols[offset + 1];
					final ICAbstractValue xv = (ICAbstractValue) _symbol_xv.value;
					final Symbol _symbol_qop = _symbols[offset + 2];
					final ICQOp qop = (ICQOp) _symbol_qop.value;
					 return new ICComplexValueQ (xv, qop);
				}
			},
			new Action() {	// [8] inputValue = isComplexValueWithCondition.xvc
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_xvc = _symbols[offset + 1];
					final ICAbstractValue xvc = (ICAbstractValue) _symbol_xvc.value;
					 return new ICComplexValueWC (xvc);
				}
			},
			new Action() {	// [9] inputValue = isComplexValueWithCondition.xvc QOp.qop
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_xvc = _symbols[offset + 1];
					final ICAbstractValue xvc = (ICAbstractValue) _symbol_xvc.value;
					final Symbol _symbol_qop = _symbols[offset + 2];
					final ICQOp qop = (ICQOp) _symbol_qop.value;
					 return new ICComplexValueWCQ (xvc, qop);
				}
			},
			new Action() {	// [10] isComplexValue = ANY.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol a = _symbols[offset + 1];
					 return new ICTypeA();
				}
			},
			new Action() {	// [11] isComplexValue = COMPLEX.x
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol x = _symbols[offset + 1];
					 return new ICTypeX();
				}
			},
			new Action() {	// [12] isComplexValue = REAL.r
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol r = _symbols[offset + 1];
					 return new ICTypeR();
				}
			},
			new Action() {	// [13] isComplexValueWithCondition = isComplexValue.xv LCURLY ConditionSet.cos RCURLY
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_xv = _symbols[offset + 1];
					final ICAbstractValue xv = (ICAbstractValue) _symbol_xv.value;
					final Symbol _symbol_cos = _symbols[offset + 3];
					final ICConditionSet cos = (ICConditionSet) _symbol_cos.value;
					 return new ICComplexValueWCExpanded(xv, cos);
				}
			},
			new Action() {	// [14] QOp = PLUS.pl
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol pl = _symbols[offset + 1];
					 return new ICQplus();
				}
			},
			new Action() {	// [15] QOp = MULT.mu
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol mu = _symbols[offset + 1];
					 return new ICQmult();
				}
			},
			new Action() {	// [16] QOp = QUESTION.qu
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol qu = _symbols[offset + 1];
					 return new ICQquestion();
				}
			},
			new Action() {	// [17] ConditionSet = Condition.co
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_co = _symbols[offset + 1];
					final ICCondition co = (ICCondition) _symbol_co.value;
					 return new ICConditionSet(null, null, co);
				}
			},
			new Action() {	// [18] ConditionSet = ConditionSet.cos Logical.lo Condition.co
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_cos = _symbols[offset + 1];
					final ICConditionSet cos = (ICConditionSet) _symbol_cos.value;
					final Symbol _symbol_lo = _symbols[offset + 2];
					final ICLogical lo = (ICLogical) _symbol_lo.value;
					final Symbol _symbol_co = _symbols[offset + 3];
					final ICCondition co = (ICCondition) _symbol_co.value;
					 return new ICConditionSet(cos, lo, co);
				}
			},
			new Action() {	// [19] Condition = RelOp.ro Value.val
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_ro = _symbols[offset + 1];
					final ICRelop ro = (ICRelop) _symbol_ro.value;
					final Symbol _symbol_val = _symbols[offset + 2];
					final ICValue val = (ICValue) _symbol_val.value;
					 return new ICCondition(ro, val);
				}
			},
			new Action() {	// [20] Logical = LAND.land
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol land = _symbols[offset + 1];
					 return new ICLand();
				}
			},
			new Action() {	// [21] Logical = LOR.lor
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol lor = _symbols[offset + 1];
					 return new ICLor();
				}
			},
			new Action() {	// [22] RelOp = LT.lt
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol lt = _symbols[offset + 1];
					 return new ICRlt();
				}
			},
			new Action() {	// [23] RelOp = GT.gt
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol gt = _symbols[offset + 1];
					 return new ICRgt();
				}
			},
			new Action() {	// [24] RelOp = LTE.lte
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol lte = _symbols[offset + 1];
					 return new ICRlte();
				}
			},
			new Action() {	// [25] RelOp = GTE.gte
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol gte = _symbols[offset + 1];
					 return new ICRgte();
				}
			},
			new Action() {	// [26] RelOp = EQEQ.eqeq
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol eqeq = _symbols[offset + 1];
					 return new ICReqeq();
				}
			},
			new Action() {	// [27] RelOp = NEQ.neq
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol neq = _symbols[offset + 1];
					 return new ICRneq();
				}
			},
			new Action() {	// [28] Value = NUMBER.n
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_n = _symbols[offset + 1];
					final Number n = (Number) _symbol_n.value;
					 return new ICNumber(n);
				}
			},
			new Action() {	// [29] outputValueList = outputValue.ov
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_ov = _symbols[offset + 1];
					final ICAbstractValue ov = (ICAbstractValue) _symbol_ov.value;
					 return new ICoutputValueList(null, ov);
				}
			},
			new Action() {	// [30] outputValueList = outputValueList.ovl COMMA outputValue.ov
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_ovl = _symbols[offset + 1];
					final ICoutputValueList ovl = (ICoutputValueList) _symbol_ovl.value;
					final Symbol _symbol_ov = _symbols[offset + 3];
					final ICAbstractValue ov = (ICAbstractValue) _symbol_ov.value;
					 return new ICoutputValueList(ovl, ov);
				}
			},
			new Action() {	// [31] outputValue = ternaryOpExp.toe
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_toe = _symbols[offset + 1];
					final ICternaryOpExp toe = (ICternaryOpExp) _symbol_toe.value;
					 return new ICtoe (toe);
				}
			},
			new Action() {	// [32] outputValue = isComplexValue.xv
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_xv = _symbols[offset + 1];
					final ICAbstractValue xv = (ICAbstractValue) _symbol_xv.value;
					 return new ICComplexValue (xv);
				}
			},
			new Action() {	// [33] outputValue = isComplexValue.xv QOp.qop
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_xv = _symbols[offset + 1];
					final ICAbstractValue xv = (ICAbstractValue) _symbol_xv.value;
					final Symbol _symbol_qop = _symbols[offset + 2];
					final ICQOp qop = (ICQOp) _symbol_qop.value;
					 return new ICComplexValueQ (xv, qop);
				}
			},
			new Action() {	// [34] ternaryOpExp = inputAttribute.ia Condition.co QUESTION isComplexValue.xv1 QOp.qop1 COLON isComplexValue.xv2 QOp.qop2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_ia = _symbols[offset + 1];
					final ICinputAtt ia = (ICinputAtt) _symbol_ia.value;
					final Symbol _symbol_co = _symbols[offset + 2];
					final ICCondition co = (ICCondition) _symbol_co.value;
					final Symbol _symbol_xv1 = _symbols[offset + 4];
					final ICAbstractValue xv1 = (ICAbstractValue) _symbol_xv1.value;
					final Symbol _symbol_qop1 = _symbols[offset + 5];
					final ICQOp qop1 = (ICQOp) _symbol_qop1.value;
					final Symbol _symbol_xv2 = _symbols[offset + 7];
					final ICAbstractValue xv2 = (ICAbstractValue) _symbol_xv2.value;
					final Symbol _symbol_qop2 = _symbols[offset + 8];
					final ICQOp qop2 = (ICQOp) _symbol_qop2.value;
					 return new ICtoeExp(ia, co, xv1, qop1, xv2, qop2);
				}
			},
			new Action() {	// [35] ternaryOpExp = inputAttribute.ia Condition.co QUESTION isComplexValue.xv1 COLON isComplexValue.xv2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_ia = _symbols[offset + 1];
					final ICinputAtt ia = (ICinputAtt) _symbol_ia.value;
					final Symbol _symbol_co = _symbols[offset + 2];
					final ICCondition co = (ICCondition) _symbol_co.value;
					final Symbol _symbol_xv1 = _symbols[offset + 4];
					final ICAbstractValue xv1 = (ICAbstractValue) _symbol_xv1.value;
					final Symbol _symbol_xv2 = _symbols[offset + 6];
					final ICAbstractValue xv2 = (ICAbstractValue) _symbol_xv2.value;
					 return new ICtoeExp(ia, co, xv1, null, xv2, null);
				}
			},
			new Action() {	// [36] ternaryOpExp = inputAttribute.ia Condition.co QUESTION isComplexValue.xv1 COLON isComplexValue.xv2 QOp.qop2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_ia = _symbols[offset + 1];
					final ICinputAtt ia = (ICinputAtt) _symbol_ia.value;
					final Symbol _symbol_co = _symbols[offset + 2];
					final ICCondition co = (ICCondition) _symbol_co.value;
					final Symbol _symbol_xv1 = _symbols[offset + 4];
					final ICAbstractValue xv1 = (ICAbstractValue) _symbol_xv1.value;
					final Symbol _symbol_xv2 = _symbols[offset + 6];
					final ICAbstractValue xv2 = (ICAbstractValue) _symbol_xv2.value;
					final Symbol _symbol_qop2 = _symbols[offset + 7];
					final ICQOp qop2 = (ICQOp) _symbol_qop2.value;
					 return new ICtoeExp(ia, co, xv1, null, xv2, qop2);
				}
			},
			new Action() {	// [37] ternaryOpExp = inputAttribute.ia Condition.co QUESTION isComplexValue.xv1 QOp.qop1 COLON isComplexValue.xv2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_ia = _symbols[offset + 1];
					final ICinputAtt ia = (ICinputAtt) _symbol_ia.value;
					final Symbol _symbol_co = _symbols[offset + 2];
					final ICCondition co = (ICCondition) _symbol_co.value;
					final Symbol _symbol_xv1 = _symbols[offset + 4];
					final ICAbstractValue xv1 = (ICAbstractValue) _symbol_xv1.value;
					final Symbol _symbol_qop1 = _symbols[offset + 5];
					final ICQOp qop1 = (ICQOp) _symbol_qop1.value;
					final Symbol _symbol_xv2 = _symbols[offset + 7];
					final ICAbstractValue xv2 = (ICAbstractValue) _symbol_xv2.value;
					 return new ICtoeExp(ia, co, xv1, qop1, xv2, null);
				}
			},
			new Action() {	// [38] ternaryOpExp = inputAttribute.ia Condition.co QUESTION isComplexValue.xv1 COLON
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_ia = _symbols[offset + 1];
					final ICinputAtt ia = (ICinputAtt) _symbol_ia.value;
					final Symbol _symbol_co = _symbols[offset + 2];
					final ICCondition co = (ICCondition) _symbol_co.value;
					final Symbol _symbol_xv1 = _symbols[offset + 4];
					final ICAbstractValue xv1 = (ICAbstractValue) _symbol_xv1.value;
					 return new ICtoeExp(ia, co, xv1, null, null, null);
				}
			},
			new Action() {	// [39] inputAttribute = ID.i
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i = _symbols[offset + 1];
					final String i = (String) _symbol_i.value;
					 return new ICid(i);
				}
			}
		};
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		return actions[rule_num].reduce(_symbols, offset);
	}
}
