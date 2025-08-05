package com.taobao.umipublish.extension.windvane;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.an;
import com.taobao.android.litecreator.util.at;
import com.taobao.android.litecreator.util.ba;
import com.taobao.tao.flexbox.layoutmanager.container.a;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;
import tb.rdz;

/* loaded from: classes9.dex */
public class PublishConfigManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1708226477);
    }

    public static /* synthetic */ void a(PublishConfigManager publishConfigManager, Context context, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdb57658", new Object[]{publishConfigManager, context, jSONObject, str});
        } else {
            publishConfigManager.a(context, jSONObject, str);
        }
    }

    public static /* synthetic */ void a(PublishConfigManager publishConfigManager, Context context, JSONObject jSONObject, rdz rdzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8878af6", new Object[]{publishConfigManager, context, jSONObject, rdzVar});
        } else {
            publishConfigManager.b(context, jSONObject, rdzVar);
        }
    }

    public static /* synthetic */ void b(PublishConfigManager publishConfigManager, Context context, JSONObject jSONObject, rdz rdzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28537395", new Object[]{publishConfigManager, context, jSONObject, rdzVar});
        } else {
            publishConfigManager.c(context, jSONObject, rdzVar);
        }
    }

    public void a(final Context context, final JSONObject jSONObject, final rdz<String> rdzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dffcd778", new Object[]{this, context, jSONObject, rdzVar});
            return;
        }
        String string = jSONObject.getString(a.CONFIG_POLICY);
        if (TextUtils.isEmpty(string)) {
            string = "netFirst";
        }
        if ("netFirst".equals(string)) {
            c(context, jSONObject, new rdz<String>() { // from class: com.taobao.umipublish.extension.windvane.PublishConfigManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.rdz
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    } else if (TextUtils.isEmpty(str)) {
                        PublishConfigManager.a(PublishConfigManager.this, context, jSONObject, rdzVar);
                    } else {
                        rdzVar.a(str);
                    }
                }
            });
        } else if ("onlyNet".equals(string)) {
            c(context, jSONObject, new rdz<String>() { // from class: com.taobao.umipublish.extension.windvane.PublishConfigManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.rdz
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    } else {
                        rdzVar.a(str);
                    }
                }
            });
        } else if ("cacheFirst".equals(string)) {
            b(context, jSONObject, new rdz<String>() { // from class: com.taobao.umipublish.extension.windvane.PublishConfigManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.rdz
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    } else if (TextUtils.isEmpty(str)) {
                        PublishConfigManager.b(PublishConfigManager.this, context, jSONObject, rdzVar);
                    } else {
                        rdzVar.a(str);
                        PublishConfigManager.b(PublishConfigManager.this, context, jSONObject, null);
                    }
                }
            });
        } else if (!"onlyCache".equals(string)) {
        } else {
            b(context, jSONObject, new rdz<String>() { // from class: com.taobao.umipublish.extension.windvane.PublishConfigManager.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.rdz
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    rdzVar.a(str);
                    PublishConfigManager.b(PublishConfigManager.this, context, jSONObject, null);
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.taobao.umipublish.extension.windvane.PublishConfigManager$5] */
    private void b(final Context context, JSONObject jSONObject, final rdz<String> rdzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3288ab9", new Object[]{this, context, jSONObject, rdzVar});
            return;
        }
        final String a2 = a(jSONObject);
        new AsyncTask<Void, Void, String>() { // from class: com.taobao.umipublish.extension.windvane.PublishConfigManager.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.String] */
            @Override // android.os.AsyncTask
            public /* synthetic */ String doInBackground(Void[] voidArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
            }

            @Override // android.os.AsyncTask
            public /* synthetic */ void onPostExecute(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b105c779", new Object[]{this, str});
                } else {
                    a(str);
                }
            }

            public String a(Void... voidArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("45c9f3cc", new Object[]{this, voidArr}) : an.b(context, a2, "");
            }

            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                } else {
                    rdzVar.a(str);
                }
            }
        }.execute(new Void[0]);
    }

    private void a(Context context, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("381e885a", new Object[]{this, context, jSONObject, str});
        } else {
            an.a(context, a(jSONObject), str);
        }
    }

    private String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject});
        }
        JSONObject parseObject = JSON.parseObject(jSONObject.toString());
        parseObject.remove(a.CONFIG_POLICY);
        String a2 = ba.a();
        String b = at.b(parseObject.toString());
        return b + "|" + a2;
    }

    private void c(final Context context, final JSONObject jSONObject, final rdz<String> rdzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6543dfa", new Object[]{this, context, jSONObject, rdzVar});
            return;
        }
        GuangPublishConfigRequest guangPublishConfigRequest = new GuangPublishConfigRequest();
        guangPublishConfigRequest.setParams(jSONObject.toString());
        MtopBusiness.build(Mtop.instance(null), guangPublishConfigRequest).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.umipublish.extension.windvane.PublishConfigManager.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                rdz rdzVar2 = rdzVar;
                if (rdzVar2 == null) {
                    return;
                }
                rdzVar2.a(null);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                String jSONObject2 = mtopResponse.getDataJsonObject() == null ? "" : mtopResponse.getDataJsonObject().toString();
                rdz rdzVar2 = rdzVar;
                if (rdzVar2 != null) {
                    rdzVar2.a(jSONObject2);
                }
                if (TextUtils.isEmpty(jSONObject2)) {
                    return;
                }
                PublishConfigManager.a(PublishConfigManager.this, context, jSONObject, jSONObject2);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                rdz rdzVar2 = rdzVar;
                if (rdzVar2 == null) {
                    return;
                }
                rdzVar2.a(null);
            }
        }).mo1305reqMethod(MethodEnum.POST).startRequest();
    }
}
