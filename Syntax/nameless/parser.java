
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Syntax.nameless;

import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\025\000\002\002\004\000\002\002\003\000\002\003" +
    "\002\000\002\003\003\000\002\003\005\000\002\004\003" +
    "\000\002\004\003\000\002\004\010\000\002\004\003\000" +
    "\002\004\004\000\002\004\004\000\002\004\004\000\002" +
    "\004\003\000\002\004\003\000\002\004\014\000\002\004" +
    "\004\000\002\004\005\000\002\005\003\000\002\005\003" +
    "\000\002\005\005\000\002\005\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\055\000\032\002\uffff\005\010\006\007\014\004\016" +
    "\021\020\017\021\016\022\015\023\012\025\011\027\020" +
    "\030\013\001\002\000\044\002\ufffb\004\ufffb\005\ufffb\006" +
    "\ufffb\007\ufffb\011\ufffb\014\ufffb\016\ufffb\017\ufffb\020\ufffb" +
    "\021\ufffb\022\ufffb\023\ufffb\025\ufffb\026\ufffb\027\ufffb\030" +
    "\ufffb\001\002\000\004\002\057\001\002\000\034\002\ufffe" +
    "\004\055\005\010\006\007\014\004\016\021\020\017\021" +
    "\016\022\015\023\012\025\011\027\020\030\013\001\002" +
    "\000\030\005\010\006\007\014\004\016\021\020\017\021" +
    "\016\022\015\023\012\025\011\027\020\030\013\001\002" +
    "\000\044\002\ufff9\004\ufff9\005\ufff9\006\ufff9\007\ufff9\011" +
    "\ufff9\014\ufff9\016\ufff9\017\ufff9\020\ufff9\021\ufff9\022\ufff9" +
    "\023\ufff9\025\ufff9\026\ufff9\027\ufff9\030\ufff9\001\002\000" +
    "\030\005\010\006\007\014\004\016\021\020\017\021\016" +
    "\022\015\023\012\025\011\027\020\030\013\001\002\000" +
    "\030\005\010\006\007\014\004\016\021\020\017\021\016" +
    "\022\015\023\012\025\011\027\020\030\013\001\002\000" +
    "\044\002\ufff5\004\ufff5\005\ufff5\006\ufff5\007\ufff5\011\ufff5" +
    "\014\ufff5\016\ufff5\017\ufff5\020\ufff5\021\ufff5\022\ufff5\023" +
    "\ufff5\025\ufff5\026\ufff5\027\ufff5\030\ufff5\001\002\000\004" +
    "\002\000\001\002\000\030\005\010\006\007\014\004\016" +
    "\021\020\017\021\016\022\015\023\012\025\011\027\020" +
    "\030\013\001\002\000\030\005\010\006\007\014\004\016" +
    "\021\020\017\021\016\022\015\023\012\025\011\027\020" +
    "\030\013\001\002\000\010\006\022\013\025\015\024\001" +
    "\002\000\044\002\ufff4\004\ufff4\005\ufff4\006\ufff4\007\ufff4" +
    "\011\ufff4\014\ufff4\016\ufff4\017\ufff4\020\ufff4\021\ufff4\022" +
    "\ufff4\023\ufff4\025\ufff4\026\ufff4\027\ufff4\030\ufff4\001\002" +
    "\000\044\002\ufffc\004\ufffc\005\ufffc\006\ufffc\007\ufffc\011" +
    "\ufffc\014\ufffc\016\ufffc\017\ufffc\020\ufffc\021\ufffc\022\ufffc" +
    "\023\ufffc\025\ufffc\026\ufffc\027\ufffc\030\ufffc\001\002\000" +
    "\010\006\022\013\025\015\024\001\002\000\006\012\027" +
    "\030\026\001\002\000\010\007\uffef\012\uffef\030\uffef\001" +
    "\002\000\010\007\ufff0\012\ufff0\030\ufff0\001\002\000\004" +
    "\006\031\001\002\000\010\006\022\013\025\015\024\001" +
    "\002\000\010\007\uffee\012\027\030\uffee\001\002\000\010" +
    "\006\022\013\025\015\024\001\002\000\006\007\033\012" +
    "\027\001\002\000\004\010\034\001\002\000\004\024\035" +
    "\001\002\000\030\005\010\006\007\014\004\016\021\020" +
    "\017\021\016\022\015\023\012\025\011\027\020\030\013" +
    "\001\002\000\032\005\010\006\007\011\037\014\004\016" +
    "\021\020\017\021\016\022\015\023\012\025\011\027\020" +
    "\030\013\001\002\000\044\002\ufff3\004\ufff3\005\ufff3\006" +
    "\ufff3\007\ufff3\011\ufff3\014\ufff3\016\ufff3\017\ufff3\020\ufff3" +
    "\021\ufff3\022\ufff3\023\ufff3\025\ufff3\026\ufff3\027\ufff3\030" +
    "\ufff3\001\002\000\044\002\ufff2\004\ufff2\005\010\006\007" +
    "\007\ufff2\011\ufff2\014\004\016\021\017\ufff2\020\017\021" +
    "\016\022\015\023\012\025\011\026\ufff2\027\020\030\013" +
    "\001\002\000\006\007\042\012\027\001\002\000\010\007" +
    "\uffed\012\uffed\030\uffed\001\002\000\032\005\010\006\007" +
    "\014\004\016\021\020\017\021\016\022\015\023\012\025" +
    "\011\026\044\027\020\030\013\001\002\000\030\005\010" +
    "\006\007\014\004\016\021\020\017\021\016\022\015\023" +
    "\012\025\011\027\020\030\013\001\002\000\032\005\010" +
    "\006\007\014\004\016\021\017\046\020\017\021\016\022" +
    "\015\023\012\025\011\027\020\030\013\001\002\000\030" +
    "\005\010\006\007\014\004\016\021\020\017\021\016\022" +
    "\015\023\012\025\011\027\020\030\013\001\002\000\044" +
    "\002\ufffa\004\ufffa\005\010\006\007\007\ufffa\011\ufffa\014" +
    "\004\016\021\017\ufffa\020\017\021\016\022\015\023\012" +
    "\025\011\026\ufffa\027\020\030\013\001\002\000\044\002" +
    "\ufff6\004\ufff6\005\010\006\007\007\ufff6\011\ufff6\014\004" +
    "\016\021\017\ufff6\020\017\021\016\022\015\023\012\025" +
    "\011\026\ufff6\027\020\030\013\001\002\000\044\002\ufff7" +
    "\004\ufff7\005\010\006\007\007\ufff7\011\ufff7\014\004\016" +
    "\021\017\ufff7\020\017\021\016\022\015\023\012\025\011" +
    "\026\ufff7\027\020\030\013\001\002\000\044\002\ufff8\004" +
    "\ufff8\005\010\006\007\007\ufff8\011\ufff8\014\004\016\021" +
    "\017\ufff8\020\017\021\016\022\015\023\012\025\011\026" +
    "\ufff8\027\020\030\013\001\002\000\032\005\010\006\007" +
    "\007\054\014\004\016\021\020\017\021\016\022\015\023" +
    "\012\025\011\027\020\030\013\001\002\000\044\002\ufff1" +
    "\004\ufff1\005\ufff1\006\ufff1\007\ufff1\011\ufff1\014\ufff1\016" +
    "\ufff1\017\ufff1\020\ufff1\021\ufff1\022\ufff1\023\ufff1\025\ufff1" +
    "\026\ufff1\027\ufff1\030\ufff1\001\002\000\032\002\uffff\005" +
    "\010\006\007\014\004\016\021\020\017\021\016\022\015" +
    "\023\012\025\011\027\020\030\013\001\002\000\004\002" +
    "\ufffd\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\055\000\010\002\004\003\013\004\005\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\004\037\001\001" +
    "\000\004\004\052\001\001\000\002\001\001\000\004\004" +
    "\051\001\001\000\004\004\050\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\004\047\001\001\000\004\004" +
    "\042\001\001\000\004\005\022\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\005\040\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\005\027\001\001\000\002\001\001\000\004\005" +
    "\031\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\004\035\001\001\000\004\004\037\001" +
    "\001\000\002\001\001\000\004\004\037\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\004\037\001\001\000" +
    "\004\004\044\001\001\000\004\004\037\001\001\000\004" +
    "\004\046\001\001\000\004\004\037\001\001\000\004\004" +
    "\037\001\001\000\004\004\037\001\001\000\004\004\037" +
    "\001\001\000\004\004\037\001\001\000\002\001\001\000" +
    "\006\003\055\004\005\001\001\000\002\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



  public Syntax.nameless.Absyn.Program pProgram() throws Exception
  {
    java_cup.runtime.Symbol res = parse();
    return (Syntax.nameless.Absyn.Program) res.value;
  }

public void syntax_error(java_cup.runtime.Symbol cur_token)
{
  report_error("Syntax Error, trying to recover and continue parse...", cur_token);
}

public void unrecovered_syntax_error(java_cup.runtime.Symbol cur_token) throws java.lang.Exception
{
  throw new Exception("Unrecoverable Syntax Error");
}



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {


public java_cup.runtime.ComplexSymbolFactory.Location getLeftLocation(
    java_cup.runtime.ComplexSymbolFactory.Location ... locations) {
  for (java_cup.runtime.ComplexSymbolFactory.Location l : locations) {
    if (l != null) {
      return l;
    }
  }
  return null;
}

  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= Program EOF 
            {
              Object RESULT =null;
		Syntax.nameless.Absyn.Program start_val = (Syntax.nameless.Absyn.Program)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // Program ::= ListExpr 
            {
              Syntax.nameless.Absyn.Program RESULT =null;
		Syntax.nameless.Absyn.ListExpr p_1 = (Syntax.nameless.Absyn.ListExpr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Syntax.nameless.Absyn.ProgramExprs(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Program",0, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // ListExpr ::= 
            {
              Syntax.nameless.Absyn.ListExpr RESULT =null;
		 RESULT = new Syntax.nameless.Absyn.ListExpr(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ListExpr",1, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // ListExpr ::= Expr 
            {
              Syntax.nameless.Absyn.ListExpr RESULT =null;
		Syntax.nameless.Absyn.Expr p_1 = (Syntax.nameless.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Syntax.nameless.Absyn.ListExpr(); RESULT.addLast(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ListExpr",1, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // ListExpr ::= Expr _SYMB_0 ListExpr 
            {
              Syntax.nameless.Absyn.ListExpr RESULT =null;
		Syntax.nameless.Absyn.Expr p_1 = (Syntax.nameless.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		Object p_2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		Syntax.nameless.Absyn.ListExpr p_3 = (Syntax.nameless.Absyn.ListExpr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = p_3; p_3.addFirst(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ListExpr",1, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Expr ::= _SYMB_10 
            {
              Syntax.nameless.Absyn.Expr RESULT =null;
		Object p_1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Syntax.nameless.Absyn.ConstTrue(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expr",2, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Expr ::= _SYMB_8 
            {
              Syntax.nameless.Absyn.Expr RESULT =null;
		Object p_1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Syntax.nameless.Absyn.ConstFalse(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expr",2, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Expr ::= _SYMB_13 Expr _SYMB_18 Expr _SYMB_11 Expr 
            {
              Syntax.nameless.Absyn.Expr RESULT =null;
		Object p_1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		Syntax.nameless.Absyn.Expr p_2 = (Syntax.nameless.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		Object p_3 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		Syntax.nameless.Absyn.Expr p_4 = (Syntax.nameless.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		Object p_5 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		Syntax.nameless.Absyn.Expr p_6 = (Syntax.nameless.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Syntax.nameless.Absyn.If(p_2,p_4,p_6); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expr",2, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Expr ::= _SYMB_1 
            {
              Syntax.nameless.Absyn.Expr RESULT =null;
		Object p_1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Syntax.nameless.Absyn.ConstZero(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expr",2, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Expr ::= _SYMB_17 Expr 
            {
              Syntax.nameless.Absyn.Expr RESULT =null;
		Object p_1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		Syntax.nameless.Absyn.Expr p_2 = (Syntax.nameless.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Syntax.nameless.Absyn.Succ(p_2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expr",2, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Expr ::= _SYMB_15 Expr 
            {
              Syntax.nameless.Absyn.Expr RESULT =null;
		Object p_1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		Syntax.nameless.Absyn.Expr p_2 = (Syntax.nameless.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Syntax.nameless.Absyn.Pred(p_2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expr",2, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Expr ::= _SYMB_14 Expr 
            {
              Syntax.nameless.Absyn.Expr RESULT =null;
		Object p_1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		Syntax.nameless.Absyn.Expr p_2 = (Syntax.nameless.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Syntax.nameless.Absyn.IsZero(p_2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expr",2, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Expr ::= _IDENT_ 
            {
              Syntax.nameless.Absyn.Expr RESULT =null;
		String p_1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Syntax.nameless.Absyn.FreeVar(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expr",2, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Expr ::= _INTEGER_ 
            {
              Syntax.nameless.Absyn.Expr RESULT =null;
		Integer p_1 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Syntax.nameless.Absyn.BoundVar(p_1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expr",2, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Expr ::= _SYMB_12 Type _IDENT_ _SYMB_2 Type _SYMB_3 _SYMB_4 _SYMB_16 Expr _SYMB_5 
            {
              Syntax.nameless.Absyn.Expr RESULT =null;
		Object p_1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-9)).value;
		Syntax.nameless.Absyn.Type p_2 = (Syntax.nameless.Absyn.Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-8)).value;
		String p_3 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-7)).value;
		Object p_4 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-6)).value;
		Syntax.nameless.Absyn.Type p_5 = (Syntax.nameless.Absyn.Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		Object p_6 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		Object p_7 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		Object p_8 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		Syntax.nameless.Absyn.Expr p_9 = (Syntax.nameless.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		Object p_10 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Syntax.nameless.Absyn.Abstraction(p_2,p_3,p_5,p_9); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expr",2, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Expr ::= Expr Expr 
            {
              Syntax.nameless.Absyn.Expr RESULT =null;
		Syntax.nameless.Absyn.Expr p_1 = (Syntax.nameless.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		Syntax.nameless.Absyn.Expr p_2 = (Syntax.nameless.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Syntax.nameless.Absyn.Application(p_1,p_2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expr",2, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Expr ::= _SYMB_2 Expr _SYMB_3 
            {
              Syntax.nameless.Absyn.Expr RESULT =null;
		Object p_1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		Syntax.nameless.Absyn.Expr p_2 = (Syntax.nameless.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		Object p_3 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = p_2; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expr",2, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Type ::= _SYMB_7 
            {
              Syntax.nameless.Absyn.Type RESULT =null;
		Object p_1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Syntax.nameless.Absyn.BoolType(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Type",3, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Type ::= _SYMB_9 
            {
              Syntax.nameless.Absyn.Type RESULT =null;
		Object p_1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Syntax.nameless.Absyn.IntType(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Type",3, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Type ::= Type _SYMB_6 Type 
            {
              Syntax.nameless.Absyn.Type RESULT =null;
		Syntax.nameless.Absyn.Type p_1 = (Syntax.nameless.Absyn.Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		Object p_2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		Syntax.nameless.Absyn.Type p_3 = (Syntax.nameless.Absyn.Type)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Syntax.nameless.Absyn.FunType(p_1,p_3); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Type",3, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Type ::= _SYMB_2 Type _SYMB_3 
            {
              Syntax.nameless.Absyn.Type RESULT =null;
		Object p_1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		Syntax.nameless.Absyn.Type p_2 = (Syntax.nameless.Absyn.Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		Object p_3 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = p_2; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Type",3, RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
