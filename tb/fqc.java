package tb;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.ae;
import com.taobao.android.dinamicx.bx;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.z;

/* loaded from: classes.dex */
public class fqc implements bbs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1448616910);
        kge.a(1711724803);
    }

    @Override // tb.bbs
    public View a(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("52a699f6", new Object[]{this, view, str});
        }
        if (view == null || StringUtils.isEmpty(str)) {
            if (DinamicXEngine.j()) {
                fuw.b("未找到" + str + "对应的view  原因为：  view == null || StringUtils.isEmpty(ref)");
            }
            return null;
        }
        DXWidgetNode a2 = a(view);
        if (!(a2 != null ? a2.isEnableButter() : false) && bx.p()) {
            return b(view, str);
        }
        if (a2 == null || a2.getReferenceNode() == null) {
            if (DinamicXEngine.j()) {
                fuw.b("未找到" + str + "对应的view  原因为： 拍平节点是空或者其对应的展开节点是空flattenWidget == null || flattenWidget.getReferenceNode() == null");
            }
            return null;
        }
        DXWidgetNode referenceNode = a2.getReferenceNode();
        if (referenceNode != view.getTag(ae.b)) {
            if (DinamicXEngine.j()) {
                fuw.b("未找到" + str + "对应的view  原因为： expandWidget != view.getTag(DXPublicConstant.TAG_ANIMATION_EXPANDED_WIDGET_ON_VIEW)");
            }
            return null;
        } else if (fqf.b(referenceNode)) {
            if (DinamicXEngine.j()) {
                fuw.b("未找到" + str + "对应的view  原因为： 当前rootview已经被复用");
            }
            return null;
        } else {
            String a3 = fqb.a(str);
            if ("this".equalsIgnoreCase(a3)) {
                if (referenceNode.getReferenceNode() == null || referenceNode.getReferenceNode().getWRView() == null) {
                    if (DinamicXEngine.j()) {
                        fuw.b("未找到" + str + "对应的view  原因为： 对应的节点上面的view已经不存在");
                    }
                    return null;
                }
                return referenceNode.getReferenceNode().getWRView().get();
            }
            DXWidgetNode queryWTByUserId = !fqi.b(referenceNode.getDXRuntimeContext()) ? referenceNode.queryWTByUserId(a3) : null;
            if (queryWTByUserId == null || queryWTByUserId.getReferenceNode() == null) {
                queryWTByUserId = referenceNode.queryWidgetNodeByUserId(a3);
            }
            if (queryWTByUserId == null || queryWTByUserId.getReferenceNode() == null || queryWTByUserId.getReferenceNode().getWRView() == null) {
                if (DinamicXEngine.j()) {
                    fuw.b("未找到" + str + "对应的view  原因为： 找不到对应的节点，或者对应节点的view不存，请检查模版bindingX.json是否书写正确");
                }
                return null;
            }
            return queryWTByUserId.getReferenceNode().getWRView().get();
        }
    }

    public View b(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("58aa6555", new Object[]{this, view, str});
        }
        z a2 = gbh.a(view);
        if (a2 == null) {
            if (DinamicXEngine.j()) {
                fuw.b("未找到" + str + "对应的view  原因为： 拍平节点是空flattenNode == null ");
            }
            return null;
        }
        DXWidgetNode e = a2.e();
        if (e != view.getTag(ae.b)) {
            if (DinamicXEngine.j()) {
                fuw.b("未找到" + str + "对应的view  原因为： expandWidget != view.getTag(DXPublicConstant.TAG_ANIMATION_EXPANDED_WIDGET_ON_VIEW)");
            }
            return null;
        } else if (fqf.b(e)) {
            if (DinamicXEngine.j()) {
                fuw.b("未找到" + str + "对应的view  原因为： 当前rootview已经被复用");
            }
            return null;
        } else {
            String a3 = fqb.a(str);
            if ("this".equalsIgnoreCase(a3)) {
                if (e.getReferenceNode() == null || e.getReferenceNode().getWRView() == null) {
                    if (DinamicXEngine.j()) {
                        fuw.b("未找到" + str + "对应的view  原因为： 对应的节点上面的view已经不存在");
                    }
                    return null;
                }
                return a2.d();
            }
            DXWidgetNode queryWTByUserId = !fqi.b(e.getDXRuntimeContext()) ? e.queryWTByUserId(a3) : null;
            if (queryWTByUserId == null || queryWTByUserId.getFlattenNode() == null) {
                queryWTByUserId = e.queryWidgetNodeByUserId(a3);
            }
            if (queryWTByUserId == null || queryWTByUserId.getFlattenNode() == null || queryWTByUserId.getFlattenNode().d() == null) {
                if (DinamicXEngine.j()) {
                    fuw.b("未找到" + str + "对应的view  原因为： 找不到对应的节点，或者对应节点的view不存，请检查模版bindingX.json是否书写正确");
                }
                return null;
            }
            return queryWTByUserId.getFlattenNode().d();
        }
    }

    private DXWidgetNode a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("ff356489", new Object[]{this, view});
        }
        if (view == null) {
            return null;
        }
        if (view instanceof DXRootView) {
            return ((DXRootView) view).getFlattenWidgetNode();
        }
        DXWidgetNode b = gbh.b(view);
        if (b instanceof DXWidgetNode) {
            return b;
        }
        return null;
    }
}
