// File generated by the BNF Converter (bnfc 2.9.4).

package Syntax.nameless.Absyn;

public class IntType  extends Type {
  public IntType() { }

  public <R,A> R accept(Syntax.nameless.Absyn.Type.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof Syntax.nameless.Absyn.IntType) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}
