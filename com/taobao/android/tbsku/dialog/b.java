package com.taobao.android.tbsku.dialog;

import android.content.Context;
import android.content.DialogInterface;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.utils.f;
import com.taobao.android.sku.c;
import com.taobao.android.tbsku.image.l;
import com.taobao.taobao.R;
import tb.iyb;
import tb.jdh;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.android.sku.widget.a f15418a;
    private jdh b;
    private c c;
    private JSONObject d;

    static {
        kge.a(665891064);
    }

    public static /* synthetic */ JSONObject a(b bVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("20454b25", new Object[]{bVar, jSONObject});
        }
        bVar.d = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ com.taobao.android.sku.widget.a a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.sku.widget.a) ipChange.ipc$dispatch("10ebed81", new Object[]{bVar}) : bVar.f15418a;
    }

    public static /* synthetic */ void a(b bVar, JSONObject jSONObject, int i, iyb iybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db76d9c", new Object[]{bVar, jSONObject, new Integer(i), iybVar});
        } else {
            bVar.a(jSONObject, i, iybVar);
        }
    }

    public static /* synthetic */ JSONObject b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("dca1b04a", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ void c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2101e09", new Object[]{bVar});
        } else {
            bVar.b();
        }
    }

    public b(Context context, l lVar, JSONArray jSONArray, iyb iybVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("icon", (Object) lVar.f15430a);
        jSONObject.put("title", (Object) lVar.b);
        jSONObject.put("pvId", (Object) lVar.c);
        a(context);
        a(context, jSONObject, jSONArray, iybVar);
    }

    public b(Context context, JSONObject jSONObject, JSONArray jSONArray, iyb iybVar) {
        a(context);
        a(context, jSONObject, jSONArray, iybVar);
    }

    private void a(Context context, JSONObject jSONObject, JSONArray jSONArray, final iyb iybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe562fb6", new Object[]{this, context, jSONObject, jSONArray, iybVar});
            return;
        }
        this.c = iybVar.b();
        this.d = jSONObject;
        this.b = new jdh(context, jSONObject, jSONArray);
        this.b.a(new jdh.b() { // from class: com.taobao.android.tbsku.dialog.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jdh.b
            public void a(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    return;
                }
                try {
                    if (b.a(b.this) == null || !b.a(b.this).isShowing()) {
                        return;
                    }
                    b.a(b.this).dismiss();
                } catch (Throwable unused) {
                }
            }

            @Override // tb.jdh.b
            public boolean b(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("9103724d", new Object[]{this, view})).booleanValue();
                }
                if (iybVar == null) {
                    f.a("[share]SKULightOff", "onLongClick:feedback null");
                    return false;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("actionFrom", (Object) "IMG_PREVIEW_LONG_CLK");
                jSONObject2.put("image", (Object) b.b(b.this));
                jSONObject2.put("dialog", (Object) b.a(b.this));
                iybVar.a(jSONObject2);
                return true;
            }

            @Override // tb.jdh.b
            public void a(JSONObject jSONObject2, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4a78e87b", new Object[]{this, jSONObject2, new Integer(i)});
                    return;
                }
                b.a(b.this, jSONObject2);
                b.a(b.this, jSONObject2, i, iybVar);
            }
        });
    }

    private void a(final JSONObject jSONObject, int i, iyb iybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e7d2979", new Object[]{this, jSONObject, new Integer(i), iybVar});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
        } else {
            String string = jSONObject.getString("viewId");
            if (!StringUtils.isEmpty(string)) {
                iybVar.h().put(string, Integer.valueOf((int) (((i / 6) * 348.5f) - 1.0f)));
            }
            iybVar.b().b(new JSONObject() { // from class: com.taobao.android.tbsku.dialog.XSkuSingleScalePopWindow$2
                {
                    put("action", "pv_sku_update");
                    put("params", (Object) jSONObject);
                }
            });
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.c.b(new JSONObject() { // from class: com.taobao.android.tbsku.dialog.XSkuSingleScalePopWindow$3
                {
                    put("action", "dart_curtain_close");
                }
            });
        }
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.f15418a = new com.taobao.android.sku.widget.a(context, R.style.Alix_Sku_PopupDialog_ImagePreview);
        this.f15418a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.taobao.android.tbsku.dialog.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                } else {
                    b.c(b.this);
                }
            }
        });
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f15418a.a(this.b.a(), -1, -1, 80);
        }
    }
}
