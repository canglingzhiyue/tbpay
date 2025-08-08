package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.context.atmo.bean.StickerConfig;
import com.taobao.android.live.plugin.atype.flexalocal.input.e;
import com.taobao.message.chat.aura.messageflow.input.ChatInputConstant;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public class hju extends RecyclerView.Adapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<StickerConfig> f28704a = new ArrayList();
    private boolean b;
    private Context c;
    private e d;
    private com.taobao.alilive.aliliveframework.frame.a e;

    /* loaded from: classes6.dex */
    public static class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public TUrlImageView f28706a;

        static {
            kge.a(72212105);
        }

        public a(View view) {
            super(view);
            this.f28706a = (TUrlImageView) view.findViewById(R.id.taolive_quick_long_item_image);
        }
    }

    /* loaded from: classes6.dex */
    public static class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public TUrlImageView f28707a;

        static {
            kge.a(1950493335);
        }

        public b(View view) {
            super(view);
            this.f28707a = (TUrlImageView) view.findViewById(R.id.taolive_quick_short_item_image);
        }
    }

    static {
        kge.a(1497089947);
    }

    public static /* synthetic */ Object ipc$super(hju hjuVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ e a(hju hjuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("650d12c2", new Object[]{hjuVar}) : hjuVar.d;
    }

    public hju(Context context, boolean z, e eVar, com.taobao.alilive.aliliveframework.frame.a aVar) {
        this.c = context;
        this.b = z;
        this.d = eVar;
        this.e = aVar;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)});
        }
        q.a("QuickExpressionAdapter", "itemViewType:" + i);
        if (i == 0) {
            return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.taolive_quick_item_short_flexalocal, (ViewGroup) null));
        }
        if (i == 1) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.taolive_quick_item_long_flexalocal, (ViewGroup) null));
        }
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.taolive_quick_item_short_flexalocal, (ViewGroup) null));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        final StickerConfig stickerConfig = this.f28704a.get(i);
        if (stickerConfig == null) {
            return;
        }
        q.a("QuickExpressionAdapter", "quick matchKey:" + stickerConfig.matchKey);
        if (viewHolder instanceof b) {
            if (!StringUtils.isEmpty(stickerConfig.thumbnail)) {
                ((b) viewHolder).f28707a.setImageUrl(stickerConfig.thumbnail);
            }
        } else if ((viewHolder instanceof a) && !StringUtils.isEmpty(stickerConfig.thumbnail)) {
            ((a) viewHolder).f28706a.setImageUrl(stickerConfig.thumbnail);
        }
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: tb.hju.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                RecyclerView.ViewHolder viewHolder2 = viewHolder;
                if (viewHolder2 instanceof b) {
                    if (hju.a(hju.this) == null) {
                        return;
                    }
                    hju.a(hju.this).onOfficialStickerSelected(stickerConfig, ((b) viewHolder).f28707a.getDrawable(), null, true);
                } else if (!(viewHolder2 instanceof a) || hju.a(hju.this) == null) {
                } else {
                    hju.a(hju.this).onAnchorCustomStickerSelected(stickerConfig, ((a) viewHolder).f28706a.getDrawable(), "quickExpression", true);
                }
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<StickerConfig> list = this.f28704a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.f28704a.size() > i) {
            StickerConfig stickerConfig = this.f28704a.get(i);
            q.a("QuickExpressionAdapter", "getItemViewType type:" + stickerConfig.type);
            if (stickerConfig != null && "1".equals(stickerConfig.type)) {
                return 1;
            }
        }
        q.a("QuickExpressionAdapter", "getItemViewType type TYPE_SHORT 0");
        return 0;
    }

    public void a(List<String> list, FrameLayout frameLayout) {
        StickerConfig stickerConfig;
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7100bd5c", new Object[]{this, list, frameLayout});
            return;
        }
        int b2 = com.taobao.taolive.sdk.utils.b.b(this.c);
        int a3 = com.taobao.taolive.sdk.utils.b.a(this.c, 14.0f);
        ArrayList arrayList = new ArrayList();
        HashMap<String, StickerConfig> hashMap = new HashMap<>();
        com.taobao.alilive.aliliveframework.frame.a aVar = this.e;
        if (aVar != null && (aVar.I() instanceof ffg)) {
            hashMap = ((ffg) this.e.I()).c();
        }
        for (String str : list) {
            if (hashMap != null && hashMap.containsKey(str) && (stickerConfig = hashMap.get(str)) != null) {
                if (StringUtils.equals(stickerConfig.type, "1")) {
                    a2 = com.taobao.taolive.sdk.utils.b.a(this.c, 90.0f);
                } else {
                    a2 = com.taobao.taolive.sdk.utils.b.a(this.c, 24.0f);
                }
                a3 = a3 + a2 + com.taobao.taolive.sdk.utils.b.a(this.c, 24.0f);
                if (a3 > b2 || arrayList.size() > 9) {
                    break;
                }
                arrayList.add(stickerConfig);
                a(stickerConfig);
                q.a("QuickExpressionAdapter", "refreshData matchKey:" + stickerConfig.matchKey + " type:" + stickerConfig.type);
            }
        }
        this.f28704a.clear();
        this.f28704a.addAll(arrayList);
        if (this.f28704a.size() > 0) {
            notifyDataSetChanged();
            frameLayout.setVisibility(0);
            return;
        }
        frameLayout.setVisibility(8);
    }

    private void a(StickerConfig stickerConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3208c642", new Object[]{this, stickerConfig});
            return;
        }
        try {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("type", StringUtils.equals("1", stickerConfig.type) ? "longword" : ChatInputConstant.PANEL_ID_EMOJI);
            hashMap.put("emoticon_id", stickerConfig.id);
            phg.a().a(this.e, "Comment_EmoticonConvenient", hashMap);
        } catch (Exception e) {
            q.a("QuickExpressionAdapter", "trackShowItem catch exception:" + e.getMessage());
        }
    }
}
