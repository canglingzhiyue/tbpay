package tb;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.a;
import com.alibaba.android.aura.f;
import com.alibaba.android.umf.constants.UMFConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@AURAExtensionImpl(code = "aura.impl.render.component.creator.weex")
/* loaded from: classes2.dex */
public final class aws extends atl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String d = "AURAWeexComponentExtension";
    private List<WXSDKInstance> e;
    private aqs f;

    static {
        kge.a(2062406713);
    }

    public static /* synthetic */ Object ipc$super(aws awsVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != 563256106) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
    }

    public static /* synthetic */ f a(aws awsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("be65048f", new Object[]{awsVar}) : awsVar.b();
    }

    public static /* synthetic */ void a(aws awsVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f27647c5", new Object[]{awsVar, str});
        } else {
            awsVar.a(str);
        }
    }

    @Override // tb.atl, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        this.f = aqsVar;
        a(aURAGlobalData);
        super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
    }

    private void a(AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed894fe", new Object[]{this, aURAGlobalData});
            return;
        }
        this.e = (List) aURAGlobalData.get("auraRenderWeexInstances", List.class);
        if (this.e != null) {
            return;
        }
        this.e = new ArrayList();
        aURAGlobalData.update("auraRenderWeexInstances", this.e);
    }

    private void a(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("421b9086", new Object[]{this, wXSDKInstance});
        } else {
            this.e.add(wXSDKInstance);
        }
    }

    @Override // tb.atc
    public View a(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e8922edd", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        a(frameLayout);
        Iterator it = b().b(awu.class).iterator();
        while (it.hasNext()) {
            it.next();
        }
        return frameLayout;
    }

    private WXSDKInstance a(final ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("d347af45", new Object[]{this, viewGroup});
        }
        Object tag = viewGroup.getTag(R.id.aura_render_component_weex_instance);
        if (tag instanceof WXSDKInstance) {
            return (WXSDKInstance) tag;
        }
        WXSDKInstance wXSDKInstance = new WXSDKInstance(viewGroup.getContext());
        wXSDKInstance.a(new d() { // from class: tb.aws.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.weex.d
            public void onRefreshSuccess(WXSDKInstance wXSDKInstance2, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance2, new Integer(i), new Integer(i2)});
                }
            }

            @Override // com.taobao.weex.d
            public void onRenderSuccess(WXSDKInstance wXSDKInstance2, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance2, new Integer(i), new Integer(i2)});
                }
            }

            @Override // com.taobao.weex.d
            public void onViewCreated(WXSDKInstance wXSDKInstance2, View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance2, view});
                } else if (view == null) {
                    aws.a(aws.this, "onViewCreated#view is null");
                } else {
                    ViewGroup viewGroup2 = viewGroup;
                    if (viewGroup2 == null) {
                        aws.a(aws.this, "onViewCreated#containerLayout is null");
                        return;
                    }
                    viewGroup2.removeAllViews();
                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    Iterator it = aws.a(aws.this).b(awu.class).iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    viewGroup.addView(view);
                }
            }

            @Override // com.taobao.weex.d
            public void onException(WXSDKInstance wXSDKInstance2, String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance2, str, str2});
                    return;
                }
                aws awsVar = aws.this;
                aws.a(awsVar, str + "|" + str2);
            }
        });
        viewGroup.setTag(R.id.aura_render_component_weex_instance, wXSDKInstance);
        a(wXSDKInstance);
        return wXSDKInstance;
    }

    @Override // tb.atc
    public void a(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebad0c4", new Object[]{this, aURARenderComponent, view, new Integer(i)});
        } else if (!(view instanceof ViewGroup)) {
            this.f.a(new b(1, "DomainTaobaoAdapter", UMFConstants.ErrorCode.WORKFLOW_CONTAIN_NO_EXECUTOR, "view type is not ViewGroup"));
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            WXSDKInstance a2 = a(viewGroup);
            try {
                List b = b().b(awu.class);
                if (b.isEmpty()) {
                    a("没有配置扩展点：【aura.extension.render.component.creator.weex.lifecycle】");
                    return;
                }
                awt awtVar = null;
                Iterator it = b.iterator();
                while (it.hasNext() && (awtVar = ((awu) it.next()).a(aURARenderComponent, viewGroup, i)) == null) {
                }
                if (awtVar == null) {
                    a("AURAWeexComponentRenderModel生成失败");
                    return;
                }
                Iterator it2 = b.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
                a2.c(this.f25589a, awtVar.a(), awtVar.b(), awtVar.c(), awtVar.d());
            } catch (Exception e) {
                a(e.getMessage());
            }
        }
    }

    @Override // tb.atc
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : a.b.g;
    }

    @Override // tb.atc
    public String a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2c2912d", new Object[]{this, aURARenderComponent});
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null) {
            return String.valueOf(System.currentTimeMillis());
        }
        AURARenderComponentContainer aURARenderComponentContainer = aURARenderComponentData.container;
        if (aURARenderComponentContainer == null) {
            return String.valueOf(System.currentTimeMillis());
        }
        return aURARenderComponent.key + aURARenderComponentContainer.name + aURARenderComponentContainer.version;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        aqs aqsVar = this.f;
        if (aqsVar == null) {
            arc.a().c("AURAWeexComponentExtension", "reportError", str);
        } else {
            aqsVar.a(new b(1, "Weex", "", str));
        }
    }

    @Override // tb.atl, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        List<WXSDKInstance> list = this.e;
        if (list == null) {
            return;
        }
        for (WXSDKInstance wXSDKInstance : list) {
            if (wXSDKInstance != null) {
                wXSDKInstance.e();
            }
        }
        this.e.clear();
    }
}
