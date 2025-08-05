package tlb.fwm;

import android.content.Context;
import android.util.Log;
import android.text.TextUtils;

import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.exception.a;
import com.taobao.android.dinamicx.expression.expr_v2.d;
import com.taobao.android.dinamicx.model.b;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.dinamicx.widget.ac;
import com.taobao.android.dinamicx.widget.m;
import com.taobao.android.dinamicx.widget.bg;
import com.taobao.android.dinamicx.eventchain.k;
import com.taobao.android.dinamicx.s;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Stack;
import java.util.Map;

public class fwm extends Object implements ggy {
    public static volatile transient synthetic IpChange $ipChange = null;
    public static final int EVENTCHAIN_MINOR_VERSION = 7;
    public static final int MAJOR_VERSION = 3;
    public static final int MINOR_VERSION_0 = 0;
    public static final int MINOR_VERSION_1 = 1;
    public static final int MINOR_VERSION_10 = 10;
    public static final int MINOR_VERSION_12 = 12;
    public static final int MINOR_VERSION_8 = 8;
    public static final int MINOR_VERSION_9 = 9;
    public static final int STATE_continue = 0;
    public static final int STATE_failed = 2;
    public static final int STATE_successful = 1;
    public static final short TYPE_ADAPTIVE_UNIT = 32;
    public static final short TYPE_BIG_STRING = 2048;
    public static final short TYPE_COLOR = 16;
    public static final short TYPE_DOUBLE = 4;
    public static final short TYPE_ENUM = 512;
    public static final short TYPE_INT = 1;
    public static final short TYPE_LIST = 128;
    public static final short TYPE_LONG = 2;
    public static final short TYPE_MAP = 256;
    public static final short TYPE_NATIVE_UNIT = 64;
    public static final short TYPE_OBJECT = 1024;
    public static final short TYPE_STRING = 8;

    public int a;
    public fwy b;
    public fwy c;
    public fwz d;
    public fwu e;
    public fws f;
    public fwq g;
    public fwt h;
    public fwv i;
    public fww j;
    public Stack<DXWidgetNode> k;
    private fwx l;
    public fwp m;
    public int n;
    public lmv o;

    static {
        kge.a(0x4e423462);
        kge.a(-0x57667e69);
    }

    public fwm() {
        k = new Stack<>();
        n = 1000;

        b = new fwy();
        c = new fwy();
        e = new fwu(c);
        d = new fwz();
        f = new fws(c);
        o = new lmv();
        h = new fwt(o);
        i = new fwv();
        j = new fww();
        g = new fwq();
        l = new fwx();
        m = new fwp();
    }

    private fwr a(byte[] buf, DXRuntimeContext runtimeContext, boolean z, Context context) {
        if ($ipChange != null) {
            return (fwr) $ipChange.ipc$dispatch("7e660691", new Object[]{this, buf, runtimeContext, Boolean.valueOf(z), context});
        }

        fwr codeReader = new fwr();
        String tag = new String(buf, 0, 5);
        if (!"ALIDX".equals(tag)) {
            Log.e("BinaryLoader_TMTEST", "loadFromBuffer failed tag is invalidate:" + tag);
            runtimeContext.n().c.add(new s.a("Pipeline", "Pipeline_Stage_Load_Binary", 0x11173));
            return null;
        }

        codeReader.a(buf);
        codeReader.b(5);

        byte majorVersion = codeReader.d();
        if (majorVersion != 3) {
            runtimeContext.n().c.add(new s.a("Pipeline", "Pipeline_Stage_Load_Binary", 0x11172));
            return null;
        }

        a = codeReader.e();
        short stringLength = codeReader.e();
        String string = new String(codeReader.a(), codeReader.b(), stringLength);
        codeReader.b(stringLength);

        codeReader.e();
        codeReader.a(codeReader.e());

        int stringPos = codeReader.f();
        int varStringPos = codeReader.f();
        int exprPos = codeReader.f();
        int enumPos = codeReader.f();
        int eventChainPos = codeReader.f();
        int exprScriptPos = codeReader.f();
        int templatePos = codeReader.f();
        int templateVersionPos = codeReader.f();
        int animationPos = codeReader.f();
        int animationVersionPos = codeReader.f();

        if (a >= 7) {
            h.g(a);
            h.a(codeReader.f());
            h.b(codeReader.f());
            h.c(codeReader.f());
            h.d(codeReader.f());
            h.e(codeReader.f());
            h.f(codeReader.f());
        }

        if (a >= 8) {
            i.a(codeReader.f());
            i.b(codeReader.f());
            g.a(codeReader.f());
            g.b(codeReader.f());
        }

        if (a >= 10) {
            int animationCount = codeReader.f();
            int animationVersionCount = codeReader.f();
            m.b(animationVersionCount);
            m.a(animationCount);
        }

        if (a >= 12) {
            o.a(codeReader.f());
            o.b(codeReader.f());
        }

        if (a >= 10) {
            m.a(codeReader, runtimeContext);
        }

        if (a >= 12) {
            o.a(codeReader, runtimeContext);
        }

        if (a >= 8) {
            g.a(codeReader, runtimeContext, context);
        }

        if (codeReader.c(stringPos)) {
            if (!d.a(string, stringPos, codeReader)) {
                Log.e("BinaryLoader_TMTEST", "string loadFromBuffer error!");
            }

            // Similar error handling for other sections (var string, expr, enum)
            // ...
        } else {
            runtimeContext.n().c.add(new s.a("Pipeline", "Pipeline_Stage_Load_Binary", 0x1117e));
        }

        try {
            if (a >= 7) {
                if (!h.a(codeReader, runtimeContext)) {
                    Log.e("BinaryLoader_TMTEST", "event chain loadFromBuffer error!");
                }
            }
        } catch (Exception e) {
            a.b(e);
            runtimeContext.n().c.add(new s.a("Pipeline", "Pipeline_Stage_Load_Event_Chain_Binary", 0x1118f, a.a(e)));
        }

        try {
            if (a >= 8) {
                if (!i.a(codeReader, runtimeContext)) {
                    Log.e("BinaryLoader_TMTEST", "Expr Script loadFromBuffer error!");
                }
            }
        } catch (Throwable t) {
            a.b(t);
            runtimeContext.n().c.add(new s.a("Pipeline", "Pipeline_Stage_Load_Binary", 0x11192, a.a(t)));
        }

        codeReader.c(stringPos);
        return codeReader;
    }

    private void a(DXWidgetNode parent, DXWidgetNode child) {
        if ($ipChange != null) {
            $ipChange.ipc$dispatch("dddbf248", new Object[]{this, parent, child});
            return;
        }

        if (child == null) return;

        if (child instanceof ac) {
            ac acNode = (ac) child;
            // Handle different types of ac nodes
            // ...
        }

        if (child instanceof m || child.getChildrenCount() > 0) {
            for (int i = 0; i < child.getChildrenCount(); i++) {
                a(parent, child.getChildAt(i));
            }
        }
    }

    private k b(fwr codeReader, DXRuntimeContext runtimeContext, Context context) {
        if ($ipChange != null) {
            return (k) $ipChange.ipc$dispatch("10519c10", new Object[]{this, codeReader, runtimeContext, context});
        }

        if (codeReader == null) {
            runtimeContext.n().c.add(new s.a("Pipeline", "Pipeline_Stage_Load_Event_Chain_Binary", 0xaae88));
            return null;
        }

        try {
            return h.b(codeReader, runtimeContext);
        } catch (Exception e) {
            if (DinamicXEngine.j()) {
                e.printStackTrace();
            }
            runtimeContext.n().c.add(new s.a("Pipeline", "Pipeline_Stage_Load_Event_Chain_Binary", 0x11191, a.a(e)));
            return null;
        }
    }

    public DXWidgetNode a(fwr codeReader, DXRuntimeContext runtimeContext, Context context) {
        if ($ipChange != null) {
            return (DXWidgetNode) $ipChange.ipc$dispatch("a14b13f", new Object[]{this, codeReader, runtimeContext, context});
        }

        if (codeReader == null) {
            Log.e("BinaryLoader_TMTEST", " createWidgetTree null == codeReader");
            runtimeContext.n().c.add(new s.a("Pipeline", "Pipeline_Stage_Load_Binary", 0x11199, " null == codeReader"));
            return null;
        }

        try {
            k.clear();
            n = 1000;

            DXWidgetNode root = null;
            DXWidgetNode current = null;
            boolean done = false;

            while (!done) {
                byte tagType = codeReader.d();
                switch (tagType) {
                    case 0: // Node
                        long nodeId = codeReader.g();
                        b widgetNodeMap = runtimeContext.j();
                        if (widgetNodeMap == null) {
                            runtimeContext.n().c.add(new s.a("Pipeline", "Pipeline_Stage_Load_Binary", 0x1119a, " runtimeContext.getWidgetNodeMap() == null"));
                            Log.e("BinaryLoader_TMTEST", " createWidgetTree runtimeContext.getWidgetNodeMap()");
                            return null;
                        }

                        ak nodeBuilder = (ak) widgetNodeMap.get(nodeId);
                        DXWidgetNode node = null;
                        boolean nodeCreated = false;

                        if (nodeBuilder != null) {
                            try {
                                node = nodeBuilder.build(context);
                                n++;
                                node.setAutoId(n);
                                node.setDXRuntimeContext(runtimeContext);
                                node.initOriginInfo(node);
                                nodeCreated = true;
                            } catch (Exception e) {
                                if (DinamicXEngine.j()) {
                                    e.printStackTrace();
                                }
                            }
                        } else {
                            runtimeContext.n().c.add(new s.a("Pipeline", "Pipeline_Stage_Load_Binary", 0x11188, "创建原型树找不到注册的widgetNode nodeId" + nodeId));
                            Log.e("BinaryLoader_TMTEST", "创建原型树找不到注册的widgetNode nodeId" + nodeId);
                        }

                        // Handle attributes, children, etc.
                        // ...
                        break;

                    case 1: // End node
                        if (k.size() > 0) {
                            DXWidgetNode parent = k.pop();
                            parent.addChild(current);
                            current = parent;
                        } else {
                            done = true;
                        }
                        break;

                    case 2: // Invalid tag
                        Log.e("BinaryLoader_TMTEST", "invalidate tag type:" + tagType);
                        done = true;
                        break;
                }
            }

            return root;
        } catch (Exception e) {
            a.b(e);
            runtimeContext.n().c.add(new s.a("Pipeline", "Pipeline_Stage_Load_Binary", 0x11185, a.a(e)));
            Log.e("BinaryLoader_TMTEST", " DXBinaryLoader createWidgetTree error 70021");
            return null;
        }
    }

    public DXWidgetNode a(byte[] buf, DXRuntimeContext runtimeContext, Context context, boolean z) {
        if ($ipChange != null) {
            return (DXWidgetNode) $ipChange.ipc$dispatch("9c4ba98b", new Object[]{this, buf, runtimeContext, context, Boolean.valueOf(z)});
        }

        if (buf == null) {
            runtimeContext.n().c.add(new s.a("Pipeline", "Pipeline_Stage_Load_Binary", 0x11171));
            Log.e("BinaryLoader_TMTEST", "DXBinaryLoader loadFromBuffer null == buf");
            return null;
        }

        fwr codeReader = a(buf, runtimeContext, z, context);
        DXWidgetNode dxWidgetNode = a(codeReader, runtimeContext, context);

        if (dxWidgetNode == null) {
            Log.e("BinaryLoader_TMTEST", "DXBinaryLoader loadFromBuffer dxWidgetNode == null!");
            return null;
        }

        if (a >= 7) {
            k eventChains = b(codeReader, runtimeContext, context);
            if (dxWidgetNode != null && eventChains != null) {
                dxWidgetNode.setDxEventChains(eventChains);
            }
        }

        if (dxWidgetNode == null) {
            Log.e("BinaryLoader_TMTEST", "处理完事件链 DXBinaryLoader loadFromBuffer dxWidgetNode == null!");
            return null;
        }

        if (a >= 8 && dxWidgetNode != null) {
            dxWidgetNode.setDxExprBytes(i.a());
            if (i.a() != null && i.a().length > 0) {
                d exprParser = runtimeContext.C().c();
                if (exprParser != null) {
                    DXTemplateItem templateItem = runtimeContext.c();
                    exprParser.a(templateItem.b(), i.a(), 0);
                }
            }
            j.a(runtimeContext, z);
        }

        if (dxWidgetNode == null) {
            Log.e("BinaryLoader_TMTEST", "处理完新表达式跟js DXBinaryLoader loadFromBuffer dxWidgetNode == null!");
            return null;
        }

        if (a >= 8 && z && dxWidgetNode != null) {
            a(dxWidgetNode, dxWidgetNode);
        }

        if (dxWidgetNode == null) {
            Log.e("BinaryLoader_TMTEST", "处理完子节点 DXBinaryLoader loadFromBuffer dxWidgetNode == null!");
            return null;
        }

        if (a >= 9) {
            dxWidgetNode.setCodeMap(e.a());
        }

        if (dxWidgetNode == null) {
            Log.e("BinaryLoader_TMTEST", "处理完 setCodeMap DXBinaryLoader loadFromBuffer dxWidgetNode == null!");
            return null;
        }

        return dxWidgetNode;
    }

    @Override
    public ggy a() {
        if ($ipChange != null) {
            return (ggy) $ipChange.ipc$dispatch("f0508a5", new Object[]{this});
        }
        return new fwm();
    }

    @Override
    public Object b() {
        if ($ipChange != null) {
            return $ipChange.ipc$dispatch("43b9c269", new Object[]{this});
        }
        return a();
    }
}