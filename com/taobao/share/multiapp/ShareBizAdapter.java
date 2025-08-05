package com.taobao.share.multiapp;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.ShareEnv;
import com.ut.share.business.ShareBusiness;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import tb.kge;
import tb.nyy;
import tb.nyz;
import tb.nzd;
import tb.nzg;
import tb.nzh;
import tb.nzi;
import tb.nzk;
import tb.nzl;
import tb.nzm;
import tb.nzo;

/* loaded from: classes8.dex */
public class ShareBizAdapter implements IShareBiz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String SHARE_BIZ_ADAPTER_CLASS;
    private nyz backFlowEngine;
    private IShareBiz shareBiz;
    private nzd shareEngine;

    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes8.dex */
    public @interface FriendsType {
        public static final int ALL_FRIENDS = 1;
        public static final int RECENT_FRIENDS = 0;
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static ShareBizAdapter f19636a;

        static {
            kge.a(2123863050);
            f19636a = new ShareBizAdapter();
        }

        public static /* synthetic */ ShareBizAdapter a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ShareBizAdapter) ipChange.ipc$dispatch("868004c2", new Object[0]) : f19636a;
        }
    }

    static {
        kge.a(588462391);
        kge.a(2081546873);
        SHARE_BIZ_ADAPTER_CLASS = "com.taobao.tao.adapter.biz.TBShareBiz";
    }

    public static ShareBizAdapter getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShareBizAdapter) ipChange.ipc$dispatch("bbc87cec", new Object[0]) : a.a();
    }

    private ShareBizAdapter() {
    }

    public void setAdapter(IShareBiz iShareBiz) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba961c14", new Object[]{this, iShareBiz});
        } else {
            this.shareBiz = iShareBiz;
        }
    }

    public void initShareAdapter() {
        if (this.shareBiz != null) {
            return;
        }
        String str = "";
        if (TextUtils.isEmpty(str)) {
            str = SHARE_BIZ_ADAPTER_CLASS;
        }
        try {
            this.shareBiz = (IShareBiz) Class.forName(str).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (InstantiationException e3) {
            e3.printStackTrace();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public nzg getAppEnv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nzg) ipChange.ipc$dispatch("f1106422", new Object[]{this});
        }
        if (this.shareBiz == null) {
            this.shareBiz = getDefaultShareBiz();
        }
        return this.shareBiz.getAppEnv();
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public nzm getShareChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nzm) ipChange.ipc$dispatch("b1410144", new Object[]{this});
        }
        if (this.shareBiz == null) {
            this.shareBiz = getDefaultShareBiz();
        }
        return this.shareBiz.getShareChannel();
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public nzk getLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nzk) ipChange.ipc$dispatch("ee8cc04d", new Object[]{this});
        }
        if (this.shareBiz == null) {
            this.shareBiz = getDefaultShareBiz();
        }
        return this.shareBiz.getLogin();
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public nzi getFriendsProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nzi) ipChange.ipc$dispatch("e4a60d32", new Object[]{this});
        }
        if (this.shareBiz == null) {
            this.shareBiz = getDefaultShareBiz();
        }
        return this.shareBiz.getFriendsProvider();
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public nzo getShareWeexSdk(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nzo) ipChange.ipc$dispatch("7cadef02", new Object[]{this, str});
        }
        if (this.shareBiz == null) {
            this.shareBiz = getDefaultShareBiz();
        }
        return this.shareBiz.getShareWeexSdk(str);
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public nzo getShareWeexSdk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nzo) ipChange.ipc$dispatch("5ae9c04c", new Object[]{this});
        }
        if (this.shareBiz == null) {
            this.shareBiz = getDefaultShareBiz();
        }
        return this.shareBiz.getShareWeexSdk("");
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public nzo getShareBackWeexSdk(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nzo) ipChange.ipc$dispatch("18b6b409", new Object[]{this, str});
        }
        if (this.shareBiz == null) {
            this.shareBiz = getDefaultShareBiz();
        }
        return this.shareBiz.getShareBackWeexSdk(str);
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public nzh getContactsInfoProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nzh) ipChange.ipc$dispatch("be9bd5b", new Object[]{this});
        }
        if (this.shareBiz == null) {
            this.shareBiz = getDefaultShareBiz();
        }
        return this.shareBiz.getContactsInfoProvider();
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public nzl getOrangeDefaultValueHelper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nzl) ipChange.ipc$dispatch("99f53efd", new Object[]{this});
        }
        if (this.shareBiz == null) {
            this.shareBiz = getDefaultShareBiz();
        }
        return this.shareBiz.getOrangeDefaultValueHelper();
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public void initShareMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca4bc35", new Object[]{this});
            return;
        }
        if (this.shareBiz == null) {
            this.shareBiz = getDefaultShareBiz();
        }
        this.shareBiz.initShareMenu();
    }

    private IShareBiz getDefaultShareBiz() {
        try {
            this.shareBiz = (IShareBiz) Class.forName(SHARE_BIZ_ADAPTER_CLASS).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (InstantiationException e3) {
            e3.printStackTrace();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        if (this.shareBiz == null) {
            this.shareBiz = new IShareBiz() { // from class: com.taobao.share.multiapp.ShareBizAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.share.multiapp.IShareBiz
                public nzh getContactsInfoProvider() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (nzh) ipChange.ipc$dispatch("be9bd5b", new Object[]{this});
                    }
                    return null;
                }

                @Override // com.taobao.share.multiapp.IShareBiz
                public nzi getFriendsProvider() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (nzi) ipChange.ipc$dispatch("e4a60d32", new Object[]{this});
                    }
                    return null;
                }

                @Override // com.taobao.share.multiapp.IShareBiz
                public nzl getOrangeDefaultValueHelper() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (nzl) ipChange.ipc$dispatch("99f53efd", new Object[]{this});
                    }
                    return null;
                }

                @Override // com.taobao.share.multiapp.IShareBiz
                public nzo getShareBackWeexSdk(String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (nzo) ipChange.ipc$dispatch("18b6b409", new Object[]{this, str});
                    }
                    return null;
                }

                @Override // com.taobao.share.multiapp.IShareBiz
                public nzo getShareWeexSdk() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (nzo) ipChange.ipc$dispatch("5ae9c04c", new Object[]{this});
                    }
                    return null;
                }

                @Override // com.taobao.share.multiapp.IShareBiz
                public nzo getShareWeexSdk(String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (nzo) ipChange.ipc$dispatch("7cadef02", new Object[]{this, str});
                    }
                    return null;
                }

                @Override // com.taobao.share.multiapp.IShareBiz
                public void initShareMenu() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("3ca4bc35", new Object[]{this});
                    }
                }

                @Override // com.taobao.share.multiapp.IShareBiz
                public nzg getAppEnv() {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (nzg) ipChange.ipc$dispatch("f1106422", new Object[]{this}) : new nzg() { // from class: com.taobao.share.multiapp.ShareBizAdapter.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.nzg
                        public String a() {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : "";
                        }

                        @Override // tb.nzg
                        public String a(String str) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return (String) ipChange2.ipc$dispatch("9f352ae", new Object[]{this, str});
                            }
                            return null;
                        }

                        @Override // tb.nzg
                        public void a(Application application) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("75c56f77", new Object[]{this, application});
                            }
                        }

                        @Override // tb.nzg
                        public Activity c() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return (Activity) ipChange2.ipc$dispatch("2515657e", new Object[]{this});
                            }
                            return null;
                        }

                        @Override // tb.nzg
                        public boolean c(String str) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
                            }
                            return true;
                        }

                        @Override // tb.nzg
                        public String d() {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("43881515", new Object[]{this}) : "";
                        }

                        @Override // tb.nzg
                        public boolean e() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
                            }
                            return false;
                        }

                        @Override // tb.nzg
                        public boolean f() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
                            }
                            return false;
                        }

                        @Override // tb.nzg
                        public List<String> h() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return (List) ipChange2.ipc$dispatch("b7e2e578", new Object[]{this});
                            }
                            return null;
                        }

                        @Override // tb.nzg
                        public Application b() {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (Application) ipChange2.ipc$dispatch("2271dcb8", new Object[]{this}) : ShareEnv.getApplication();
                        }

                        @Override // tb.nzg
                        public String g() {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("d71944f2", new Object[]{this}) : ShareBusiness.getCacheTaopassword();
                        }

                        @Override // tb.nzg
                        public void b(String str) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str});
                            } else {
                                ShareBusiness.putCacheTaopassword(str);
                            }
                        }
                    };
                }

                @Override // com.taobao.share.multiapp.IShareBiz
                public nzm getShareChannel() {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (nzm) ipChange.ipc$dispatch("b1410144", new Object[]{this}) : new nzm() { // from class: com.taobao.share.multiapp.ShareBizAdapter.1.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.nzm
                        public String a() {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : "";
                        }

                        @Override // tb.nzm
                        public String b() {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this}) : "";
                        }

                        @Override // tb.nzm
                        public String c() {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("bd025a76", new Object[]{this}) : "";
                        }

                        @Override // tb.nzm
                        public String d() {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("43881515", new Object[]{this}) : "";
                        }

                        @Override // tb.nzm
                        public String e() {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "";
                        }

                        @Override // tb.nzm
                        public String f() {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("50938a53", new Object[]{this}) : "";
                        }
                    };
                }

                @Override // com.taobao.share.multiapp.IShareBiz
                public nzk getLogin() {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (nzk) ipChange.ipc$dispatch("ee8cc04d", new Object[]{this}) : new nzk() { // from class: com.taobao.share.multiapp.ShareBizAdapter.1.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.nzk
                        public String a() {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : "";
                        }

                        @Override // tb.nzk
                        public void a(BroadcastReceiver broadcastReceiver) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("1db70fdf", new Object[]{this, broadcastReceiver});
                            }
                        }

                        @Override // tb.nzk
                        public void a(boolean z) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                            }
                        }

                        @Override // tb.nzk
                        public void b(BroadcastReceiver broadcastReceiver) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("74d500be", new Object[]{this, broadcastReceiver});
                            }
                        }

                        @Override // tb.nzk
                        public boolean b() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
                            }
                            return false;
                        }

                        @Override // tb.nzk
                        public String c() {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("bd025a76", new Object[]{this}) : "";
                        }
                    };
                }
            };
        }
        return this.shareBiz;
    }

    public nzd getShareEngine() {
        if (this.shareEngine == null) {
            try {
                this.shareEngine = (nzd) Class.forName("com.taobao.tao.adapter.biz.ShareEngine").newInstance();
            } catch (Exception e) {
                e.printStackTrace();
                nyy.c("ShareBizAdapter", "getShareEngine err");
            }
        }
        return this.shareEngine;
    }

    public nyz getBackFlowEngine() {
        if (this.backFlowEngine == null) {
            try {
                this.backFlowEngine = (nyz) Class.forName("com.taobao.tao.backflow.ClipUrlWatcherControlImp").getMethod("instance", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception e) {
                e.printStackTrace();
                nyy.c("ShareBizAdapter", "getShareEngine err");
            }
        }
        return this.backFlowEngine;
    }

    public void setBackFlowEngine(nyz nyzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3bb8e61", new Object[]{this, nyzVar});
        } else {
            this.backFlowEngine = nyzVar;
        }
    }

    public void setShareEngine(nzd nzdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0919b9e", new Object[]{this, nzdVar});
        } else {
            this.shareEngine = nzdVar;
        }
    }
}
