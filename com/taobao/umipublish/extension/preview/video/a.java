package com.taobao.umipublish.extension.preview.video;

import android.app.Activity;
import android.content.Context;
import android.taobao.windvane.util.c;
import android.taobao.windvane.util.k;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.au;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.avplayer.av;
import com.taobao.avplayer.bl;
import com.taobao.phenix.request.d;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.umipublish.extension.preview.PreviewModel;
import tb.hfj;
import tb.kge;
import tb.tek;

/* loaded from: classes9.dex */
public class a implements com.taobao.umipublish.extension.preview.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private bl f23265a;
    private ImageView b;

    /* renamed from: com.taobao.umipublish.extension.preview.video.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class C1000a {

        /* renamed from: a  reason: collision with root package name */
        public int f23270a;
        public int b;
        public int c;

        static {
            kge.a(1477408968);
        }

        public C1000a(int i, int i2, int i3) {
            this.f23270a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    static {
        kge.a(-947666813);
        kge.a(1370978373);
    }

    public static /* synthetic */ bl a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bl) ipChange.ipc$dispatch("c855d734", new Object[]{aVar}) : aVar.f23265a;
    }

    @Override // com.taobao.umipublish.extension.preview.a
    public View a(ViewGroup viewGroup, PreviewModel.Media media) {
        float f;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("982ddde2", new Object[]{this, viewGroup, media});
        }
        bl.a aVar = new bl.a((Activity) viewGroup.getContext());
        aVar.c(true);
        aVar.a(DWAspectRatio.DW_FIT_CENTER);
        aVar.a(DWInstanceType.VIDEO);
        aVar.n(false);
        aVar.d(media.path);
        aVar.d(false);
        int a2 = k.a();
        int b = k.b() - c.a(52.0f);
        FrameLayout.LayoutParams b2 = b();
        C1000a a3 = a(media.path);
        if (a3 != null && a3.f23270a > 0 && a3.b > 0) {
            if (a3.c % 180 == 0) {
                f = a3.b;
                i = a3.f23270a;
            } else {
                f = a3.f23270a;
                i = a3.b;
            }
            float f2 = f / i;
            if (f2 > 1.3333334f) {
                b2.gravity = 49;
                b = (int) Math.min(b, a2 * f2);
                b2.height = b;
            }
        }
        aVar.c(a2);
        aVar.d(b);
        aVar.a(media.path);
        aVar.a(true);
        this.f23265a = aVar.c();
        ViewGroup l = this.f23265a.l();
        Context context = viewGroup.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(l, b2);
        if (tek.c()) {
            TUrlImageView tUrlImageView = null;
            if (!StringUtils.isEmpty(media.coverUrl)) {
                tUrlImageView = new TUrlImageView(context);
                tUrlImageView.setImageUrl(media.coverUrl.startsWith("http") ? media.coverUrl : d.a(media.coverUrl));
                tUrlImageView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.umipublish.extension.preview.video.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else {
                            a.a(a.this).e();
                        }
                    }
                });
                frameLayout.addView(tUrlImageView, b());
            }
            ImageView imageView = new ImageView(context);
            this.b = imageView;
            imageView.setImageDrawable(context.getResources().getDrawable(R.drawable.umi_icon_video_preview_play));
            FrameLayout.LayoutParams b3 = b();
            b3.width = c.a(64.0f);
            b3.height = c.a(53.0f);
            frameLayout.addView(imageView, b3);
            a(context, l, tUrlImageView, imageView);
        }
        viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    private void a(final Context context, View view, final View view2, final View view3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("464a2db2", new Object[]{this, context, view, view2, view3});
            return;
        }
        this.f23265a.a(new av() { // from class: com.taobao.umipublish.extension.preview.video.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.avplayer.av
            public void onVideoClose() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("24db3403", new Object[]{this});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoComplete() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3c2c53c", new Object[]{this});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoFullScreen() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5dcccbde", new Object[]{this});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoNormalScreen() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ff4b0936", new Object[]{this});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoPause(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoPlay() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("931007b7", new Object[]{this});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoPrepared(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3faee61c", new Object[]{this, obj});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoProgressChanged(int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoSeekTo(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoStart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c2b2d56d", new Object[]{this});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoError(Object obj, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                    return;
                }
                hfj.a(context, b.a(R.string.gg_pub_video_playback_failed));
                View view4 = view2;
                if (view4 == null) {
                    return;
                }
                view4.setVisibility(0);
            }

            @Override // com.taobao.avplayer.av
            public void onVideoInfo(Object obj, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                } else if (i != 3) {
                } else {
                    au.a(new Runnable() { // from class: com.taobao.umipublish.extension.preview.video.a.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            if (view2 != null) {
                                view2.setVisibility(8);
                            }
                            view3.setVisibility(8);
                        }
                    }, 100L);
                }
            }
        });
        view.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.umipublish.extension.preview.video.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view4});
                    return;
                }
                int i = a.a(a.this).i();
                if (i == 0) {
                    return;
                }
                if (i == 1) {
                    a.a(a.this).f();
                    view3.setVisibility(0);
                } else if (i != 2) {
                } else {
                    a.a(a.this).e();
                    view3.setVisibility(8);
                }
            }
        });
    }

    @Override // com.taobao.umipublish.extension.preview.a
    public void a(View view, PreviewModel.Media media) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fad731e3", new Object[]{this, view, media});
        } else {
            this.f23265a.c();
        }
    }

    @Override // com.taobao.umipublish.extension.preview.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        bl blVar = this.f23265a;
        if (blVar == null || blVar.i() != 1) {
            return;
        }
        this.f23265a.f();
        ImageView imageView = this.b;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(0);
    }

    private FrameLayout.LayoutParams b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout.LayoutParams) ipChange.ipc$dispatch("b58c6a32", new Object[]{this}) : new FrameLayout.LayoutParams(-1, -1, 17);
    }

    @Override // com.taobao.umipublish.extension.preview.a
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        bl blVar = this.f23265a;
        if (blVar != null) {
            blVar.f();
            this.f23265a.m();
        }
        ViewParent parent = view.getParent();
        if (parent == null) {
            return;
        }
        ((ViewGroup) parent).removeView(view);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private com.taobao.umipublish.extension.preview.video.a.C1000a a(java.lang.String r7) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.umipublish.extension.preview.video.a.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            r2 = 1
            r1[r2] = r7
            java.lang.String r7 = "495aa68e"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            com.taobao.umipublish.extension.preview.video.a$a r7 = (com.taobao.umipublish.extension.preview.video.a.C1000a) r7
            return r7
        L18:
            r0 = 0
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever     // Catch: java.lang.Throwable -> L58
            r1.<init>()     // Catch: java.lang.Throwable -> L58
            r1.setDataSource(r7)     // Catch: java.lang.Throwable -> L59
            r7 = 18
            java.lang.String r7 = r1.extractMetadata(r7)     // Catch: java.lang.Throwable -> L59
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.Throwable -> L59
            r3 = 19
            java.lang.String r3 = r1.extractMetadata(r3)     // Catch: java.lang.Throwable -> L59
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L59
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L59
            r5 = 17
            if (r4 < r5) goto L45
            r2 = 24
            java.lang.String r2 = r1.extractMetadata(r2)     // Catch: java.lang.Throwable -> L59
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L59
        L45:
            com.taobao.umipublish.extension.preview.video.a$a r4 = new com.taobao.umipublish.extension.preview.video.a$a     // Catch: java.lang.Throwable -> L59
            r4.<init>(r7, r3, r2)     // Catch: java.lang.Throwable -> L59
            r1.release()
            return r4
        L4e:
            r7 = move-exception
            goto L52
        L50:
            r7 = move-exception
            r1 = r0
        L52:
            if (r1 == 0) goto L57
            r1.release()
        L57:
            throw r7
        L58:
            r1 = r0
        L59:
            if (r1 == 0) goto L5e
            r1.release()
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.umipublish.extension.preview.video.a.a(java.lang.String):com.taobao.umipublish.extension.preview.video.a$a");
    }
}
