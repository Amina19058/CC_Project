// File generated by the BNF Converter (bnfc 2.9.4).

package Syntax.nameless.Absyn;

public class BoundVar  extends Expr {
  public final Integer integer_;
  public BoundVar(Integer p1) { integer_ = p1; }

  public <R,A> R accept(Syntax.nameless.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof Syntax.nameless.Absyn.BoundVar) {
      Syntax.nameless.Absyn.BoundVar x = (Syntax.nameless.Absyn.BoundVar)o;
      return this.integer_.equals(x.integer_);
    }
    return false;
  }

  public int hashCode() {
    return this.integer_.hashCode();
  }


}
