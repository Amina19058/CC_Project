// File generated by the BNF Converter (bnfc 2.9.4).

package Syntax.nameless.Absyn;

public class FunType  extends Type {
  public final Type type_1, type_2;
  public FunType(Type p1, Type p2) { type_1 = p1; type_2 = p2; }

  public <R,A> R accept(Syntax.nameless.Absyn.Type.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof Syntax.nameless.Absyn.FunType) {
      Syntax.nameless.Absyn.FunType x = (Syntax.nameless.Absyn.FunType)o;
      return this.type_1.equals(x.type_1) && this.type_2.equals(x.type_2);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.type_1.hashCode())+this.type_2.hashCode();
  }


}
