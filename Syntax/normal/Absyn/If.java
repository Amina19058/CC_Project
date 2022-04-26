// File generated by the BNF Converter (bnfc 2.9.4).

package Syntax.normal.Absyn;

public class If  extends Expr {
  public final Expr expr_1, expr_2, expr_3;
  public If(Expr p1, Expr p2, Expr p3) { expr_1 = p1; expr_2 = p2; expr_3 = p3; }

  public <R,A> R accept(Syntax.normal.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof Syntax.normal.Absyn.If) {
      Syntax.normal.Absyn.If x = (Syntax.normal.Absyn.If)o;
      return this.expr_1.equals(x.expr_1) && this.expr_2.equals(x.expr_2) && this.expr_3.equals(x.expr_3);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.expr_1.hashCode())+this.expr_2.hashCode())+this.expr_3.hashCode();
  }


}
