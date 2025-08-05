package com.taobao.android.tab2liveroom.liveroom.plugins;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.g;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.taolive.room.controller2.r;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.b;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.ogg;

/* loaded from: classes6.dex */
public class SubLiveAbilityCostomizedPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SubLiveAbilityCostomizedPlugin";
    private TNodeView mTNodeView;

    static {
        kge.a(-96471061);
    }

    public static /* synthetic */ TNodeView access$000(SubLiveAbilityCostomizedPlugin subLiveAbilityCostomizedPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TNodeView) ipChange.ipc$dispatch("eaf30e3c", new Object[]{subLiveAbilityCostomizedPlugin}) : subLiveAbilityCostomizedPlugin.mTNodeView;
    }

    public static Map customizedPluginMap(Map map, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("979c6744", new Object[]{map, map2});
        }
        if (map == null) {
            map = new HashMap();
        }
        addSubLiveAblity(map, true, OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedToast);
        addSubLiveAblity(map, true, OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_ReplayStatusShowLiveEnd);
        addSubLiveAblity(map, false, OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Horizontal_Scrolle);
        addSubLiveAblity(map, true, OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedMoreLive);
        return map;
    }

    private static void addSubLiveAblity(Map map, boolean z, OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdb5c6d0", new Object[]{map, new Boolean(z), openAbilityCompontentTypeEnum});
        } else {
            map.putAll(new b(openAbilityCompontentTypeEnum, z, null).a());
        }
    }

    public r createLiveCustomView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("4472df5c", new Object[]{this, viewGroup});
        }
        if (viewGroup == null) {
            return null;
        }
        String constructUrl = constructUrl();
        r rVar = new r() { // from class: com.taobao.android.tab2liveroom.liveroom.plugins.SubLiveAbilityCostomizedPlugin.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.room.controller2.r
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (SubLiveAbilityCostomizedPlugin.access$000(SubLiveAbilityCostomizedPlugin.this) == null) {
                } else {
                    SubLiveAbilityCostomizedPlugin.access$000(SubLiveAbilityCostomizedPlugin.this).onStart();
                }
            }

            @Override // com.taobao.taolive.room.controller2.r
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else if (SubLiveAbilityCostomizedPlugin.access$000(SubLiveAbilityCostomizedPlugin.this) == null) {
                } else {
                    SubLiveAbilityCostomizedPlugin.access$000(SubLiveAbilityCostomizedPlugin.this).onResume();
                }
            }

            @Override // com.taobao.taolive.room.controller2.r
            public void c() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5889b6a", new Object[]{this});
                } else if (SubLiveAbilityCostomizedPlugin.access$000(SubLiveAbilityCostomizedPlugin.this) == null) {
                } else {
                    SubLiveAbilityCostomizedPlugin.access$000(SubLiveAbilityCostomizedPlugin.this).onPause();
                }
            }

            @Override // com.taobao.taolive.room.controller2.r
            public void d() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("596b2eb", new Object[]{this});
                } else if (SubLiveAbilityCostomizedPlugin.access$000(SubLiveAbilityCostomizedPlugin.this) == null) {
                } else {
                    SubLiveAbilityCostomizedPlugin.access$000(SubLiveAbilityCostomizedPlugin.this).onStop();
                }
            }

            @Override // com.taobao.taolive.room.controller2.r
            public void e() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5a4ca6c", new Object[]{this});
                } else if (SubLiveAbilityCostomizedPlugin.access$000(SubLiveAbilityCostomizedPlugin.this) == null) {
                } else {
                    SubLiveAbilityCostomizedPlugin.access$000(SubLiveAbilityCostomizedPlugin.this).onDestroy();
                }
            }
        };
        this.mTNodeView = TNodeView.create(viewGroup.getContext(), null, constructUrl, new TNodeView.b() { // from class: com.taobao.android.tab2liveroom.liveroom.plugins.SubLiveAbilityCostomizedPlugin.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.b
            public void onLayoutCompleted(aa aaVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3fb42811", new Object[]{this, aaVar});
                } else {
                    ogg.a(SubLiveAbilityCostomizedPlugin.TAG, "onTNodeView LayoutCompleted");
                }
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.b
            public void onLayoutError() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("834776a6", new Object[]{this});
                } else {
                    ogg.a(SubLiveAbilityCostomizedPlugin.TAG, "onTNodeView LayoutError");
                }
            }
        });
        viewGroup.addView(this.mTNodeView, new ViewGroup.LayoutParams(-1, -1));
        return rVar;
    }

    private String constructUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f384a7e1", new Object[]{this});
        }
        g.a("page_guangguangsidelive", "https://g.alicdn.com/tnode/guangguangsidelive/0.0.10/main.json.json", (String) null);
        return "http://h5.m.taobao.com/tnode/index.htm?tnode=page_guangguangsidelive&pagewidth=656&pagename=Page_TaobaoLiveWatch&spm=a2141.8001249";
    }
}
