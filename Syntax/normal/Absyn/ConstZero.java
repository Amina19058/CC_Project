// File generated by the BNF Converter (bnfc 2.9.4).

package Syntax.normal.Absyn;

public class ConstZero  extends Expr {
  public ConstZero() { }

  public <R,A> R accept(Syntax.normal.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof Syntax.normal.Absyn.ConstZero) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}
