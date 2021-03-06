package org.mechdancer.symbol

/** 名为 [name] 的变量 */
inline class Variable(private val name: String)
    : FactorExpression,
      BaseExpression,
      ExponentialExpression,
      LnExpression {
    override fun d() = Differential(this)
    override fun substitute(from: Expression, to: Expression) = if (this == from) to else this
    override fun toString() = name
    override fun toTex(): Tex = name
}
