package ast;

import frontend.ASTPrinter;
import utility.Location;
import utility.Tools;

import java.util.List;

public class FuncDefNode extends DefNode {
    private TypeNode retType;
    private String identifier;
    private List<VarNode> paramList;
    private BlockStmtNode stmt;

    public FuncDefNode(Location location, TypeNode retType, String identifier, List<VarNode> paramList, BlockStmtNode stmt) {
        super(location);
        this.retType = retType;
        this.identifier = identifier;
        this.paramList = paramList;
        this.stmt = stmt;
    }

    public TypeNode getRetType() {
        return retType;
    }

    public String getIdentifier() {
        return identifier;
    }

    public List<VarNode> getParamList() {
        return paramList;
    }

    public BlockStmtNode getStmt() {
        return stmt;
    }

    public void addParam(VarNode node) {
        paramList.add(node);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void dump(ASTPrinter printer, int tab) {
        Tools.printTab(tab);
        printer.visit(this);
    }

    @Override
    public String toString() {
        return "functions:\n" +
                retType + "\n" +
                identifier + "\n" +
                paramList + "\n" +
                stmt;
    }
}
