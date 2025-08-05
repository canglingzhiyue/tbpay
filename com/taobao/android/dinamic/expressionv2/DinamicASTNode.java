package com.taobao.android.dinamic.expressionv2;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class DinamicASTNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DinamicASTNodeType f11745a;
    public List<DinamicASTNode> b;
    public Object c;
    public String d;

    /* loaded from: classes5.dex */
    public enum DinamicASTNodeType {
        DinamicASTNodeTypeNone,
        DinamicASTNodeTypeRoot,
        DinamicASTNodeTypeMethod,
        DinamicASTNodeTypeVar,
        DinamicASTNodeTypeConst,
        DinamicASTNodeTypeBranchBlock,
        DinamicASTNodeTypeSerialBlock
    }

    static {
        kge.a(-1335808163);
    }

    public void a(DinamicASTNode dinamicASTNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab92d19a", new Object[]{this, dinamicASTNode});
        } else if (dinamicASTNode == null) {
        } else {
            if (this.b == null) {
                this.b = new LinkedList();
            }
            this.b.add(dinamicASTNode);
        }
    }

    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else if (this.c != obj) {
            this.c = obj;
            List<DinamicASTNode> list = this.b;
            if (list == null) {
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.b.get(i).a(obj);
            }
        }
    }

    public Object a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : this.d;
    }
}
