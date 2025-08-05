package com.taobao.message.lab.comfrm.support.vertical;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.MonitorUtil;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.EventDispatcher;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.render.RenderTemplate;
import com.taobao.message.lab.comfrm.render.WidgetInstance;
import com.taobao.message.lab.comfrm.support.Monitor;
import com.taobao.message.lab.comfrm.util.StyleUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.ept;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J$\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R2\u0010\b\u001a&\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\tj\u0012\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001`\u000bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/taobao/message/lab/comfrm/support/vertical/VerticalWidgetInstance;", "Lcom/taobao/message/lab/comfrm/render/WidgetInstance;", "Lcom/alibaba/fastjson/JSONObject;", "()V", "frameLayout", "Landroid/widget/FrameLayout;", "linearLayout", "Landroid/widget/LinearLayout;", "unique2WidgetInstanceMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", ept.SUB_BIND_VIEW, "", "data", "eventDispatcher", "Lcom/taobao/message/lab/comfrm/core/EventDispatcher;", "bindSelfData", "view", "Landroid/view/View;", ept.SUB_CREATE_VIEW, "context", "Landroid/content/Context;", "renderTemplate", "Lcom/taobao/message/lab/comfrm/render/RenderTemplate;", "postEvent", "event", "Lcom/taobao/message/lab/comfrm/core/Event;", "message_comfrm_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class VerticalWidgetInstance extends WidgetInstance<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FrameLayout frameLayout;
    private LinearLayout linearLayout;
    private HashMap<String, WidgetInstance<?>> unique2WidgetInstanceMap;

    static {
        kge.a(-1999446570);
    }

    public static /* synthetic */ Object ipc$super(VerticalWidgetInstance verticalWidgetInstance, String str, Object... objArr) {
        if (str.hashCode() == -1283962764) {
            super.postEvent((Event) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public View createView(Context context, RenderTemplate renderTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1049360c", new Object[]{this, context, renderTemplate});
        }
        q.d(context, "context");
        q.d(renderTemplate, "renderTemplate");
        this.frameLayout = new FrameLayout(context);
        this.linearLayout = new LinearLayout(context);
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout == null) {
            q.b("frameLayout");
        }
        LinearLayout linearLayout = this.linearLayout;
        if (linearLayout == null) {
            q.b("linearLayout");
        }
        frameLayout.addView(linearLayout, new ViewGroup.LayoutParams(-1, -2));
        LinearLayout linearLayout2 = this.linearLayout;
        if (linearLayout2 == null) {
            q.b("linearLayout");
        }
        linearLayout2.setOrientation(1);
        this.unique2WidgetInstanceMap = new HashMap<>(4);
        FrameLayout frameLayout2 = this.frameLayout;
        if (frameLayout2 == null) {
            q.b("frameLayout");
        }
        return frameLayout2;
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public void bindData(JSONObject jSONObject, EventDispatcher eventDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b185178e", new Object[]{this, jSONObject, eventDispatcher});
            return;
        }
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout == null) {
            q.b("frameLayout");
        }
        bindSelfData(frameLayout, jSONObject, eventDispatcher);
        Object obj = getViewObject().children.get(Constants.Slot.DEF_SLOT);
        if (obj instanceof List) {
            for (ViewObject viewObject : (List) obj) {
                if (viewObject.uniqueId == null && ApplicationUtil.isDebug()) {
                    throw new IllegalArgumentException("VerticalWidgetInstance|viewObject.uniqueId|null");
                }
                HashMap<String, WidgetInstance<?>> hashMap = this.unique2WidgetInstanceMap;
                if (hashMap == null) {
                    q.b("unique2WidgetInstanceMap");
                }
                WidgetInstance<?> widgetInstance = hashMap.get(viewObject.uniqueId);
                if (widgetInstance == null) {
                    WidgetInstance<?> widgetInstance2 = createSubView(viewObject.info.renderTemplate);
                    HashMap<String, WidgetInstance<?>> hashMap2 = this.unique2WidgetInstanceMap;
                    if (hashMap2 == null) {
                        q.b("unique2WidgetInstanceMap");
                    }
                    String str = viewObject.uniqueId;
                    q.b(str, "viewObject.uniqueId");
                    q.b(widgetInstance2, "widgetInstance");
                    hashMap2.put(str, widgetInstance2);
                    widgetInstance2.bindViewObject(viewObject, eventDispatcher);
                    if (widgetInstance2.getView() != null) {
                        LinearLayout linearLayout = this.linearLayout;
                        if (linearLayout == null) {
                            q.b("linearLayout");
                        }
                        linearLayout.addView(widgetInstance2.getView());
                    }
                    View view = widgetInstance2.getView();
                    q.b(view, "widgetInstance.view");
                    StyleUtil.processStyle(view, viewObject.info.style);
                } else {
                    widgetInstance.bindViewObject(viewObject, eventDispatcher);
                }
            }
        }
        LinearLayout linearLayout2 = this.linearLayout;
        if (linearLayout2 == null) {
            q.b("linearLayout");
        }
        if (linearLayout2.getChildCount() > 0) {
            MonitorUtil.commitSuccess(Monitor.MODULE_COMFRM, Monitor.POINT_LOAD_VERTICAL_COMPONENT_RATE, "vertical");
        } else {
            MonitorUtil.commitFail(Monitor.MODULE_COMFRM, Monitor.POINT_LOAD_VERTICAL_COMPONENT_RATE, "vertical", "CHILD_FAIL", "child count == 0");
        }
    }

    private final void bindSelfData(View view, JSONObject jSONObject, EventDispatcher eventDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("377bc544", new Object[]{this, view, jSONObject, eventDispatcher});
        } else {
            StyleUtil.processStyle(view, getViewObject().info.style);
        }
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance, com.taobao.message.lab.comfrm.render.WidgetInterface
    public void postEvent(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3784874", new Object[]{this, event});
            return;
        }
        super.postEvent(event);
        HashMap<String, WidgetInstance<?>> hashMap = this.unique2WidgetInstanceMap;
        if (hashMap == null) {
            q.b("unique2WidgetInstanceMap");
        }
        for (WidgetInstance<?> widgetInstance : hashMap.values()) {
            widgetInstance.postEvent(event);
        }
    }
}
