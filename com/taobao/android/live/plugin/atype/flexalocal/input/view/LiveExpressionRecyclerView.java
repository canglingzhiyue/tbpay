package com.taobao.android.live.plugin.atype.flexalocal.input.view;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.context.atmo.bean.StickerGroup;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.atype.flexalocal.input.d;
import com.taobao.android.live.plugin.atype.flexalocal.input.e;
import com.taobao.message.chat.aura.messageflow.input.ChatInputConstant;
import com.taobao.taolive.sdk.utils.q;
import java.util.HashMap;
import java.util.List;
import tb.kge;
import tb.phg;
import tb.plx;

/* loaded from: classes6.dex */
public class LiveExpressionRecyclerView extends RecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int PORTRAIT_BOTTOM_MARGIN = 0;
    private static final float PORTRAIT_LEFT_RIGHT_MARGIN = -0.75f;
    private static final int PORTRAIT_TOP_MARGIN = 0;
    private static final String TAG = "LiveExpressionRecyclerView";
    private d mAdapter;
    private a mFrameContext;
    private e mListener;

    static {
        kge.a(-855662431);
    }

    public static /* synthetic */ Object ipc$super(LiveExpressionRecyclerView liveExpressionRecyclerView, String str, Object... objArr) {
        if (str.hashCode() == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ d access$000(LiveExpressionRecyclerView liveExpressionRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("216ee9c7", new Object[]{liveExpressionRecyclerView}) : liveExpressionRecyclerView.mAdapter;
    }

    public LiveExpressionRecyclerView(final Context context, e eVar, a aVar) {
        super(context);
        this.mListener = eVar;
        this.mFrameContext = aVar;
        if (this.mFrameContext.b) {
            setPadding(-com.taobao.taolive.room.utils.d.a(context, 12.0f), 0, -com.taobao.taolive.room.utils.d.a(context, 12.0f), 0);
        } else {
            setPadding(com.taobao.taolive.room.utils.d.a(context, (float) PORTRAIT_LEFT_RIGHT_MARGIN), 0, 0, 0);
        }
        addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.view.LiveExpressionRecyclerView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == -1263079482) {
                    super.getItemOffsets((Rect) objArr[0], (View) objArr[1], (RecyclerView) objArr[2], (RecyclerView.State) objArr[3]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
                    return;
                }
                super.getItemOffsets(rect, view, recyclerView, state);
                if (recyclerView.getChildPosition(view) != LiveExpressionRecyclerView.access$000(LiveExpressionRecyclerView.this).getItemCount() - 1) {
                    return;
                }
                rect.bottom = com.taobao.taolive.room.utils.d.a(context, 74.0f);
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    public void refreshData(List<StickerGroup> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63658657", new Object[]{this, list, new Boolean(z)});
            return;
        }
        d dVar = this.mAdapter;
        if (dVar == null) {
            this.mAdapter = new d(getContext(), this.mListener, this.mFrameContext.b);
            this.mAdapter.a(list);
            setAdapter(this.mAdapter);
        } else {
            dVar.a(list);
            this.mAdapter.notifyDataSetChanged();
        }
        if (list != null && list.size() > 0) {
            plx.a(TAG, "refreshData commonStickerConfig:" + list.size());
            StickerGroup stickerGroup = list.get(0);
            if (stickerGroup != null && stickerGroup.stickers != null) {
                plx.a(TAG, "refreshData:" + stickerGroup.stickers.size());
            } else {
                plx.a(TAG, "refreshData stickerGroup is null");
            }
        }
        trackModuleShow(list, z);
    }

    private void trackModuleShow(List<StickerGroup> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa48fba8", new Object[]{this, list, new Boolean(z)});
        } else if (list != null && list.size() != 0) {
            try {
                for (StickerGroup stickerGroup : list) {
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("module_name", stickerGroup.type);
                    hashMap.put("tab", z ? "longword" : ChatInputConstant.PANEL_ID_EMOJI);
                    phg.a().a(this.mFrameContext, "Comment_EmoticonModel", hashMap);
                }
            } catch (Exception e) {
                q.a(TAG, "trackModuleShow catch exception:" + e.getMessage());
            }
        }
    }
}
