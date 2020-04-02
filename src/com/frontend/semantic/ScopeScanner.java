package com.frontend.semantic;

import com.ast.*;
import com.frontend.Scope;
import com.frontend.type.*;

public class ScopeScanner implements ASTVisitor {
    protected Scope globalScope;
    public Type boolType = new BoolType();
    public Type intType = new IntType();
    public Type stringType = new StringType();
    public Type nullType = new NullType();
    public Type voidType = new VoidType();

    @Override
    public void visit(ProgramNode node) {

    }

    @Override
    public void visit(VarDefNode node) {

    }

    @Override
    public void visit(ClassDefNode node) {

    }

    @Override
    public void visit(FuncDefNode node) {

    }

    @Override
    public void visit(VarDefStmtNode node) {

    }

    @Override
    public void visit(ExprStmtNode node) {

    }

    @Override
    public void visit(IfStmtNode node) {

    }

    @Override
    public void visit(WhileStmtNode node) {

    }

    @Override
    public void visit(ForStmtNode node) {

    }

    @Override
    public void visit(ReturnStmtNode node) {

    }

    @Override
    public void visit(BreakStmtNode node) {

    }

    @Override
    public void visit(ContinueStmtNode node) {

    }

    @Override
    public void visit(BlockStmtNode node) {

    }

    @Override
    public void visit(ExprListNode node) {

    }

    @Override
    public void visit(IdentifierExprNode node) {

    }

    @Override
    public void visit(ThisExprNode node) {

    }

    @Override
    public void visit(MemberExprNode node) {

    }

    @Override
    public void visit(ArrayExprNode node) {

    }

    @Override
    public void visit(FuncExprNode node) {

    }

    @Override
    public void visit(NewExprNode node) {

    }

    @Override
    public void visit(PostfixExprNode node) {

    }

    @Override
    public void visit(PrefixExprNode node) {

    }

    @Override
    public void visit(BinaryExprNode node) {

    }

    @Override
    public void visit(BoolConstNode node) {

    }

    @Override
    public void visit(IntConstNode node) {

    }

    @Override
    public void visit(StringConstNode node) {

    }

    @Override
    public void visit(NullConstNode node) {

    }

    @Override
    public void visit(TypeNode node) {

    }

    @Override
    public void visit(VarNode node) {

    }

    @Override
    public void visit(VarListNode node) {

    }
}
