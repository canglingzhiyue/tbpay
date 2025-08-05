package com.alibaba.triver.cannal_engine.scene;

import android.app.Activity;
import android.graphics.Bitmap;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.point.app.AppDestroyPoint;
import com.alibaba.ariver.app.api.point.app.AppResumePoint;
import com.alibaba.ariver.app.api.point.app.AppStartPoint;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.integration.embedview.BaseEmbedView;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.TRWidgetInstance;
import com.alibaba.triver.cannal_engine.common.TRWidgetConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.a;
import com.taobao.themis.widget.event.WebWidgetNestedRenderContainer;
import com.taobao.weex.RenderContainer;
import com.taobao.weex.WXSDKInstance;
import java.util.HashMap;
import java.util.Map;
import tb.cbr;
import tb.cbs;
import tb.kge;

/* loaded from: classes3.dex */
public class TRWidgetMiniAppEmbedView extends BaseEmbedView implements AppDestroyPoint, AppResumePoint, AppStartPoint {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE = "widget";
    private FragmentActivity b;
    private ViewGroup c;
    private TRWidgetInstance d;
    private WXSDKInstance e;
    private String f;
    private String g;
    private WidgetStartParams h;
    private String i;
    private b k;
    private Map<String, String> m;

    /* renamed from: a  reason: collision with root package name */
    private String f3647a = "TRWidgetMiniAppEmbedView";
    private boolean l = false;
    private boolean j = false;

    static {
        kge.a(227670374);
        kge.a(985272245);
        kge.a(-1968005700);
        kge.a(2033524132);
    }

    public static /* synthetic */ Object ipc$super(TRWidgetMiniAppEmbedView tRWidgetMiniAppEmbedView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 1664325763) {
            super.onCreate((Map) objArr[0]);
            return null;
        } else if (hashCode != 2111529549) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onParamChanged((String[]) objArr[0], (String[]) objArr[1]);
            return null;
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public Bitmap getSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a92c69f", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public String getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : "widget";
    }

    @Override // com.alibaba.ariver.app.api.point.app.AppDestroyPoint
    public void onAppDestroy(App app) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ffc9373", new Object[]{this, app});
        }
    }

    @Override // com.alibaba.ariver.app.api.point.app.AppResumePoint
    public void onAppResume(App app) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af37acaa", new Object[]{this, app});
        }
    }

    @Override // com.alibaba.ariver.app.api.point.app.AppStartPoint
    public void onAppStart(App app) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a9c35b", new Object[]{this, app});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onAttachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bdbec2", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDetachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850d0fb4", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onEmbedViewVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c81239", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedRender(JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb20669", new Object[]{this, jSONObject, bridgeCallback});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43aa2a2d", new Object[]{this, new Integer(i), strArr, iArr});
        }
    }

    public static /* synthetic */ void access$000(TRWidgetMiniAppEmbedView tRWidgetMiniAppEmbedView, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a6c63e2", new Object[]{tRWidgetMiniAppEmbedView, str, jSONObject});
        } else {
            tRWidgetMiniAppEmbedView.a(str, jSONObject);
        }
    }

    public static /* synthetic */ void access$100(TRWidgetMiniAppEmbedView tRWidgetMiniAppEmbedView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f65a251", new Object[]{tRWidgetMiniAppEmbedView, new Boolean(z)});
        } else {
            tRWidgetMiniAppEmbedView.a(z);
        }
    }

    private void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null) {
            RVLogger.e(this.f3647a, "params null");
        } else {
            if (map.get("bridgeId") != null) {
                this.g = map.get("bridgeId");
            }
            if (map.get("renderUrl") != null) {
                this.i = map.get("renderUrl");
            }
            this.m = map;
        }
    }

    private void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else if (getOuterPage() == null) {
        } else {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("bridgeId", (Object) this.g);
            try {
                sendEvent(str, jSONObject, null);
            } catch (Throwable th) {
                RVLogger.e(this.f3647a, th);
            }
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onCreate(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63339883", new Object[]{this, map});
            return;
        }
        super.onCreate(map);
        b();
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public View getView(int i, int i2, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcdbb931", new Object[]{this, new Integer(i), new Integer(i2), str, str2, map});
        }
        this.f = str;
        if (this.b == null) {
            return null;
        }
        a(map);
        if (TextUtils.isEmpty(this.i)) {
            a();
        } else {
            a(this.i);
        }
        return this.c;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.m == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(this.m);
            this.l = cbs.a(this.b, jSONObject);
            if (this.l) {
                jSONObject.put("hasAttached", (Object) Boolean.valueOf(this.j));
                this.k = new b();
                b bVar = this.k;
                FragmentActivity fragmentActivity = this.b;
                this.c = bVar.a(jSONObject, fragmentActivity, new WebWidgetNestedRenderContainer(fragmentActivity, b.a(jSONObject)), new a.C0936a() { // from class: com.alibaba.triver.cannal_engine.scene.TRWidgetMiniAppEmbedView.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                        if (str.hashCode() == -650670724) {
                            super.a((String) objArr[0], (String) objArr[1]);
                            return null;
                        }
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    }

                    @Override // com.taobao.themis.external.embed.a.C0936a
                    public void b(String str, String str2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
                        } else if (TRWidgetMiniAppEmbedView.this.getOuterPage() == null) {
                        } else {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("errorCode", (Object) str);
                            jSONObject2.put("errorMsg", (Object) str2);
                            TRWidgetMiniAppEmbedView.access$000(TRWidgetMiniAppEmbedView.this, "jsError", jSONObject2);
                        }
                    }

                    @Override // com.taobao.themis.external.embed.a.C0936a
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            TRWidgetMiniAppEmbedView.access$000(TRWidgetMiniAppEmbedView.this, "renderFinish", null);
                        }
                    }

                    @Override // com.taobao.themis.external.embed.a.C0936a
                    public void a(String str, String str2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                            return;
                        }
                        super.a(str, str2);
                        if (TRWidgetMiniAppEmbedView.this.getOuterPage() == null) {
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("errorCode", (Object) str);
                        jSONObject2.put("errorMessage", (Object) str2);
                        TRWidgetMiniAppEmbedView.access$000(TRWidgetMiniAppEmbedView.this, "renderError", jSONObject2);
                    }
                });
                a(true);
                return;
            }
            try {
                this.h = (WidgetStartParams) JSON.parseObject(jSONObject.toJSONString(), WidgetStartParams.class);
                this.h.build();
            } catch (Exception e) {
                RVLogger.e(this.f3647a, e);
            }
            Fragment fragment = null;
            if (getOuterPage() != null && (getOuterPage().getPageContext() instanceof Fragment)) {
                fragment = (Fragment) getOuterPage().getPageContext();
            }
            this.c = new com.alibaba.triver.cannal_engine.event.webembed.WebWidgetNestedRenderContainer(this.b, cbs.a(this.h));
            FragmentActivity fragmentActivity2 = this.b;
            String groupId = this.h.getGroupId();
            this.d = new TRWidgetInstance(fragmentActivity2, groupId, "Canal" + this.f);
            this.d.setAttachStatus(this.j);
            this.d.registerWidgetInitListener(new TRWidgetInstance.d() { // from class: com.alibaba.triver.cannal_engine.scene.TRWidgetMiniAppEmbedView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.d
                public void a(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                    } else if (TRWidgetMiniAppEmbedView.this.getOuterPage() == null) {
                    } else {
                        TRWidgetMiniAppEmbedView.access$100(TRWidgetMiniAppEmbedView.this, z);
                    }
                }
            });
            this.d.registerWidgetRenderListener(new TRWidgetInstance.g() { // from class: com.alibaba.triver.cannal_engine.scene.TRWidgetMiniAppEmbedView.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.g
                public void a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    } else if (TRWidgetMiniAppEmbedView.this.getOuterPage() == null) {
                    } else {
                        TRWidgetMiniAppEmbedView.access$000(TRWidgetMiniAppEmbedView.this, "renderFinish", null);
                    }
                }

                @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.g
                public void a(com.alibaba.triver.cannal_engine.common.a aVar, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("af2eb696", new Object[]{this, aVar, map});
                    } else if (TextUtils.equals(TRWidgetConstant.CL_TRIVER_INITING.f3640a, aVar.f3640a) || TRWidgetMiniAppEmbedView.this.getOuterPage() == null) {
                    } else {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("errorCode", (Object) aVar.f3640a);
                        jSONObject2.put("errorMessage", (Object) aVar.b);
                        jSONObject2.put("errorActionType", (Object) aVar.c);
                        TRWidgetMiniAppEmbedView.access$000(TRWidgetMiniAppEmbedView.this, "renderError", jSONObject2);
                    }
                }
            });
            this.d.registerWidgetExceptionListener(new TRWidgetInstance.c() { // from class: com.alibaba.triver.cannal_engine.scene.TRWidgetMiniAppEmbedView.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.c
                public void a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    } else if (TRWidgetMiniAppEmbedView.this.getOuterPage() == null) {
                    } else {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("errorCode", (Object) str);
                        jSONObject2.put("errorMsg", (Object) str2);
                        TRWidgetMiniAppEmbedView.access$000(TRWidgetMiniAppEmbedView.this, "jsError", jSONObject2);
                    }
                }
            });
            this.d.registerWidgetMonitorListener(new TRWidgetInstance.f() { // from class: com.alibaba.triver.cannal_engine.scene.TRWidgetMiniAppEmbedView.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.f
                public void a(String str, JSONObject jSONObject2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject2});
                        return;
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("name", (Object) str);
                    jSONObject3.put("args", (Object) jSONObject2);
                    TRWidgetMiniAppEmbedView.access$000(TRWidgetMiniAppEmbedView.this, "apicall", jSONObject3);
                }

                @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.f
                public void a(MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
                    } else if (motionEvent == null) {
                    } else {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("eventType", (Object) "click");
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("x", (Object) Float.valueOf(motionEvent.getX()));
                        jSONObject3.put("y", (Object) Float.valueOf(motionEvent.getY()));
                        jSONObject3.put("identifier", (Object) Integer.valueOf(motionEvent.hashCode()));
                        jSONObject2.put("detail", (Object) jSONObject3);
                        TRWidgetMiniAppEmbedView.access$000(TRWidgetMiniAppEmbedView.this, "widgetclick", jSONObject2);
                    }
                }

                @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.f
                public void a(JSONObject jSONObject2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject2});
                    } else {
                        TRWidgetMiniAppEmbedView.access$000(TRWidgetMiniAppEmbedView.this, "widgettouch", jSONObject2);
                    }
                }
            });
            ((com.alibaba.triver.cannal_engine.event.webembed.WebWidgetNestedRenderContainer) this.c).setWidget(this.d);
            this.d.setRootContainer((com.alibaba.triver.cannal_engine.event.webembed.WebWidgetNestedRenderContainer) this.c);
            this.d.setFragment(fragment);
            this.d.render(this.h);
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("display", (Object) Boolean.valueOf(z));
        a("widgetInit", jSONObject);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.c = new FrameLayout(this.b);
        RenderContainer renderContainer = new RenderContainer(this.b);
        renderContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.e = new WXSDKInstance(this.b);
        this.c.addView(renderContainer);
        cbr.a(renderContainer, this.e, str, new cbr.a() { // from class: com.alibaba.triver.cannal_engine.scene.TRWidgetMiniAppEmbedView.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.cbr.a
            public void a(WXSDKInstance wXSDKInstance, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("91cf7a9a", new Object[]{this, wXSDKInstance, str2, str3});
                } else if (TRWidgetMiniAppEmbedView.this.getOuterPage() == null) {
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("errorCode", (Object) str2);
                    jSONObject.put("errorMessage", (Object) str3);
                    TRWidgetMiniAppEmbedView.access$000(TRWidgetMiniAppEmbedView.this, "renderError", jSONObject);
                }
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
        if (r9.equals(com.taobao.weex.common.Constants.Event.SLOT_LIFECYCLE.ATTACH) != false) goto L17;
     */
    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onReceivedMessage(java.lang.String r9, com.alibaba.fastjson.JSONObject r10, final com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r11) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.triver.cannal_engine.scene.TRWidgetMiniAppEmbedView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L1b
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r8
            r1[r5] = r9
            r1[r3] = r10
            r1[r2] = r11
            java.lang.String r9 = "231420a4"
            r0.ipc$dispatch(r9, r1)
            return
        L1b:
            java.lang.String r0 = "attach"
            boolean r1 = r0.equals(r9)
            if (r1 == 0) goto L25
            r8.j = r5
        L25:
            java.lang.String r1 = "detach"
            boolean r6 = r1.equals(r9)
            if (r6 == 0) goto L2f
            r8.j = r4
        L2f:
            r6 = -1
            int r7 = r9.hashCode()
            switch(r7) {
                case -1407259067: goto L55;
                case -1335224429: goto L4d;
                case -295960470: goto L42;
                case 938814190: goto L38;
                default: goto L37;
            }
        L37:
            goto L5c
        L38:
            java.lang.String r0 = "getMonitorData"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L5c
            r4 = 3
            goto L5d
        L42:
            java.lang.String r0 = "updateSize"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L5c
            r4 = 2
            goto L5d
        L4d:
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L5c
            r4 = 1
            goto L5d
        L55:
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L5c
            goto L5d
        L5c:
            r4 = -1
        L5d:
            if (r4 == 0) goto L98
            if (r4 == r5) goto L89
            if (r4 == r3) goto L81
            if (r4 == r2) goto L66
            goto L80
        L66:
            if (r11 != 0) goto L69
            return
        L69:
            com.alibaba.triver.cannal_engine.TRWidgetInstance r9 = r8.d
            if (r9 == 0) goto L74
            com.alibaba.fastjson.JSONObject r9 = r9.getWidgetMonitor()
            r11.sendJSONResponse(r9)
        L74:
            com.alibaba.triver.cannal_engine.scene.b r9 = r8.k
            if (r9 == 0) goto L80
            com.alibaba.triver.cannal_engine.scene.TRWidgetMiniAppEmbedView$7 r10 = new com.alibaba.triver.cannal_engine.scene.TRWidgetMiniAppEmbedView$7
            r10.<init>()
            r9.a(r10)
        L80:
            return
        L81:
            com.alibaba.triver.cannal_engine.TRWidgetInstance r9 = r8.d
            if (r9 == 0) goto L88
            r9.updateSize(r10)
        L88:
            return
        L89:
            com.alibaba.triver.cannal_engine.TRWidgetInstance r9 = r8.d
            if (r9 == 0) goto L90
            r9.onDetach(r10)
        L90:
            com.alibaba.triver.cannal_engine.scene.b r9 = r8.k
            if (r9 == 0) goto L97
            r9.b()
        L97:
            return
        L98:
            com.alibaba.triver.cannal_engine.TRWidgetInstance r9 = r8.d
            if (r9 == 0) goto L9f
            r9.onAttach(r10)
        L9f:
            com.alibaba.triver.cannal_engine.scene.b r9 = r8.k
            if (r9 == 0) goto La6
            r9.a()
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.cannal_engine.scene.TRWidgetMiniAppEmbedView.onReceivedMessage(java.lang.String, com.alibaba.fastjson.JSONObject, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback):void");
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onParamChanged(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddb624d", new Object[]{this, strArr, strArr2});
            return;
        }
        try {
            super.onParamChanged(strArr, strArr2);
            HashMap hashMap = new HashMap();
            for (int i = 0; i < strArr.length; i++) {
                hashMap.put(strArr[i], strArr2[i]);
            }
        } catch (Exception e) {
            RVLogger.e(this.f3647a, "onParamChanged exception:", e);
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        TRWidgetInstance tRWidgetInstance = this.d;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.destroy();
        }
        WXSDKInstance wXSDKInstance = this.e;
        if (wXSDKInstance != null) {
            wXSDKInstance.onActivityDestroy();
        }
        b bVar = this.k;
        if (bVar == null) {
            return;
        }
        bVar.c();
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb053b0e", new Object[]{this});
            return;
        }
        TRWidgetInstance tRWidgetInstance = this.d;
        if (tRWidgetInstance == null) {
            return;
        }
        tRWidgetInstance.resume();
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b457ef63", new Object[]{this});
            return;
        }
        TRWidgetInstance tRWidgetInstance = this.d;
        if (tRWidgetInstance == null) {
            return;
        }
        tRWidgetInstance.pause();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.mOuterPage == null || this.mOuterPage.getPageContext() == null) {
        } else {
            Activity activity = this.mOuterPage.getPageContext().getActivity();
            this.b = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        }
    }
}
