// File generated by the BNF Converter (bnfc 2.9.4).

package Syntax.normal.Absyn;

public class Abstraction  extends Expr {
  public final Type type_1, type_2;
  public final String ident_1, ident_2;
  public final Expr expr_;
  public Abstraction(Type p1, String p2, Type p3, String p4, Expr p5) { type_1 = p1; ident_1 = p2; type_2 = p3; ident_2 = p4; expr_ = p5; }

  public <R,A> R accept(Syntax.normal.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof Syntax.normal.Absyn.Abstraction) {
      Syntax.normal.Absyn.Abstraction x = (Syntax.normal.Absyn.Abstraction)o;
      return this.type_1.equals(x.type_1) && this.ident_1.equals(x.ident_1) && this.type_2.equals(x.type_2) && this.ident_2.equals(x.ident_2) && this.expr_.equals(x.expr_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(37*(37*(this.type_1.hashCode())+this.ident_1.hashCode())+this.type_2.hashCode())+this.ident_2.hashCode())+this.expr_.hashCode();
  }


}
