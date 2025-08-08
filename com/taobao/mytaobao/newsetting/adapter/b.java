package com.taobao.mytaobao.newsetting.adapter;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.constants.LoginSceneConstants;
import com.taobao.mytaobao.newsetting.business.model.DynamicSettingItem;
import com.taobao.mytaobao.newsetting.d;
import com.taobao.mytaobao.ut.c;
import com.taobao.search.common.util.k;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import tb.kge;
import tb.mvm;
import tb.mxp;
import tb.mxz;

/* loaded from: classes7.dex */
public class b extends RecyclerView.Adapter<mvm> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f18421a;
    private Context b;
    private LayoutInflater c;
    private List<DynamicSettingItem> d;
    private String e = "-1";
    private boolean g = false;
    private Handler h = new Handler();

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Context a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("a2b8cc6a", new Object[]{bVar}) : bVar.b;
    }

    public static /* synthetic */ void a(b bVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("712d0786", new Object[]{bVar, str, str2});
        } else {
            bVar.a(str, str2);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(mvm mvmVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, mvmVar, new Integer(i)});
        } else {
            a(mvmVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [tb.mvm, android.support.v7.widget.RecyclerView$ViewHolder] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ mvm mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    static {
        kge.a(-1980742302);
        f18421a = "SettingItemsAdapter";
    }

    public b(Context context) {
        this.b = context;
        this.c = LayoutInflater.from(context);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public void a(List<DynamicSettingItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list == null) {
        } else {
            this.d = list;
            notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<DynamicSettingItem> list = this.d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public mvm a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mvm) ipChange.ipc$dispatch("56b42866", new Object[]{this, viewGroup, new Integer(i)}) : new mvm(this.c.inflate(R.layout.new_mytaobao_setting_page_item, (ViewGroup) null));
    }

    public void a(mvm mvmVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b38b750f", new Object[]{this, mvmVar, new Integer(i)});
            return;
        }
        DynamicSettingItem dynamicSettingItem = this.d.get(i);
        d.a().a(mvmVar, mvmVar.itemView.getContext());
        String str = dynamicSettingItem.moduleNumber;
        if (this.g && i == 0) {
            this.e = str;
        }
        if (this.e.equals(str)) {
            mvmVar.f31286a.setVisibility(0);
            mvmVar.b.setVisibility(8);
        } else {
            this.e = str;
            mvmVar.f31286a.setVisibility(8);
            mvmVar.b.setVisibility(0);
        }
        String str2 = dynamicSettingItem.menuName;
        if (str2 != null) {
            mvmVar.d.setText(str2);
        } else {
            mvmVar.d.setText("");
        }
        String str3 = dynamicSettingItem.menuDesc;
        if (str3 != null) {
            if (dynamicSettingItem.forceDisplayDesc) {
                mvmVar.f.setText(str3);
                mvmVar.f.setVisibility(0);
            } else {
                String b = b(str2);
                if (StringUtils.isEmpty(b)) {
                    mvmVar.f.setText(str3);
                    mvmVar.f.setVisibility(0);
                } else {
                    if (!b.equals(str2 + str3)) {
                        mvmVar.f.setText(str3);
                        mvmVar.f.setVisibility(0);
                    } else {
                        mvmVar.f.setVisibility(8);
                    }
                }
            }
        } else {
            mvmVar.f.setVisibility(8);
        }
        String str4 = dynamicSettingItem.descIcon;
        if (!StringUtils.isEmpty(str4)) {
            mvmVar.g.setImageUrl(str4);
            mvmVar.g.setVisibility(0);
        } else {
            mvmVar.g.setVisibility(8);
        }
        if (!StringUtils.isEmpty(dynamicSettingItem.hrefUrl)) {
            mvmVar.h.setVisibility(0);
            mvmVar.c.setTag(dynamicSettingItem.menuName);
            mvmVar.c.setOnClickListener(new a(dynamicSettingItem));
        } else {
            mvmVar.h.setVisibility(4);
        }
        if (dynamicSettingItem.showRedDot) {
            mvmVar.i.setVisibility(0);
        } else {
            mvmVar.i.setVisibility(8);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Handler handler = this.h;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    /* loaded from: classes7.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private DynamicSettingItem b;
        private String c;
        private Handler d;
        private final String e;

        static {
            kge.a(-698207557);
            kge.a(-1201612728);
        }

        public static /* synthetic */ Handler a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("e099dd91", new Object[]{aVar}) : aVar.d;
        }

        public a(DynamicSettingItem dynamicSettingItem) {
            this.b = dynamicSettingItem;
            this.c = dynamicSettingItem.hrefUrl;
            this.e = dynamicSettingItem.fastUrl;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            final String str;
            boolean z;
            boolean uri;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            if (StringUtils.isEmpty(this.e)) {
                str = this.c;
                z = false;
            } else {
                str = this.e;
                z = true;
            }
            if (StringUtils.isEmpty(str)) {
                return;
            }
            String str2 = this.b.menuDesc;
            if (!StringUtils.isEmpty(str2)) {
                b.a(b.this, this.b.menuName, this.b.menuName + str2);
            }
            if (view.getTag() != null) {
                TBS.Ext.commitEvent("Page_MYTBSettingVC", Integer.parseInt("2101"), this.b.utName, null, null, "spm-url=" + this.b.spm);
                HashMap hashMap = new HashMap();
                hashMap.put("spm-url", this.b.spm);
                c.a(hashMap);
            }
            if (str.contains("modify_password") || str.contains("bind_phone") || str.contains("change_phone") || str.contains("retrieve_password")) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("com.taobao.tao.login.REFRESH_COOKIES_FIRST", true);
                this.d = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.taobao.mytaobao.newsetting.adapter.b.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.os.Handler.Callback
                    public boolean handleMessage(Message message) {
                        Context a2;
                        String str3;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
                        }
                        switch (message.what) {
                            case 911101:
                                if (!StringUtils.isEmpty(str)) {
                                    if (str.contains("modify_password")) {
                                        a2 = b.a(b.this);
                                        str3 = LoginSceneConstants.SCENE_CHANGEPASSWORD;
                                    } else if (str.contains("bind_phone")) {
                                        a2 = b.a(b.this);
                                        str3 = LoginSceneConstants.SCENE_BINDMOBILE;
                                    } else if (str.contains("change_phone")) {
                                        a2 = b.a(b.this);
                                        str3 = LoginSceneConstants.SCENE_CHANGEMOBILE;
                                    } else if (str.contains("retrieve_password")) {
                                        a2 = b.a(b.this);
                                        str3 = LoginSceneConstants.SCENE_FOUNDPASSWORD;
                                    }
                                    Login.navByScene(a2, str3);
                                }
                                Login.deleteLoadedListener(a.a(a.this));
                                mxp.a();
                                break;
                            case 911102:
                            case 911103:
                            case Login.NOTIFY_WEEDOUT /* 911106 */:
                                Login.deleteLoadedListener(a.a(a.this));
                                break;
                        }
                        return true;
                    }
                });
                Login.login(this.d, true, bundle);
                return;
            }
            if (!z) {
                str = b.this.a(str);
            }
            try {
                if (z) {
                    uri = Nav.from(b.a(b.this)).toUriSimple(str);
                } else if (mxz.g && ("https://m.taobao.com/go/mytaobao/newpaysettings".equals(str) || "http://m.taobao.com/go/newmytaobaocommonsettings2".equals(str) || "http://m.taobao.com/go/newmytaobaohelpsettings".equals(str))) {
                    uri = Nav.from(b.a(b.this)).skipAllProcessors().toUri(str);
                } else {
                    uri = Nav.from(b.a(b.this)).toUri(str);
                }
                if (!uri) {
                    TLog.logd("TaoBaoSettingActivity", " ~ setting item jump failed !");
                }
                if (!this.b.showRedDot) {
                    return;
                }
                com.taobao.mytaobao.newsetting.business.request.b.a(view.getContext(), this.b.key);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        String scheme = Uri.parse(str).getScheme();
        if (scheme != null && ("http".equals(scheme) || "https".equals(scheme))) {
            return str;
        }
        return k.HTTPS_PREFIX + str;
    }

    private void a(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            com.taobao.mytaobao.base.b.c(new Runnable() { // from class: com.taobao.mytaobao.newsetting.adapter.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Globals.getApplication().getSharedPreferences("SettingItemsAdapterSp", 0).edit().putString(str, str2).apply();
                    }
                }
            });
        }
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str}) : this.b.getSharedPreferences("SettingItemsAdapterSp", 0).getString(str, null);
    }
}
