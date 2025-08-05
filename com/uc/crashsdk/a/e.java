package com.uc.crashsdk.a;

import org.ifaa.android.manager.face.IFAAFaceManager;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes.dex */
public class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f23747a = !e.class.desiredAssertionStatus();
    private final int b;
    private final Object[] c;

    public e(int i) {
        this.b = i;
        this.c = null;
    }

    public e(int i, Object[] objArr) {
        this.b = i;
        this.c = objArr;
    }

    public final boolean a() {
        int i = this.b;
        if (i == 451 || i == 452) {
            return com.uc.crashsdk.e.b(this.b, this.c);
        }
        switch (i) {
            case 351:
            case 352:
            case 353:
            case 354:
                return h.b(i, this.c);
            default:
                switch (i) {
                    case IMediaPlayer.MEDIA_INFO_RTC_VIDEO_FIRST_FRAME_TIME /* 751 */:
                    case IMediaPlayer.MEDIA_INFO_RTC_AUDIO_FIRST_PACKET_TIME /* 752 */:
                    case 753:
                    case 754:
                    case 755:
                    case 756:
                        return com.uc.crashsdk.f.a(i, this.c);
                    default:
                        a.d("crashsdk", "Unknown sync runnable: " + toString());
                        if (!f23747a) {
                            throw new AssertionError();
                        }
                        return false;
                }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = this.b;
        if (i == 10) {
            f.a(i, this.c);
        } else if (i == 500) {
            d.a(i);
        } else if (i == 700) {
            com.uc.crashsdk.f.b(i);
        } else if (i == 800) {
            g.a(i);
        } else if (i == 201 || i == 202) {
            com.uc.crashsdk.a.a(this.b);
        } else {
            switch (i) {
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                    com.uc.crashsdk.b.a(i);
                    return;
                default:
                    switch (i) {
                        case 301:
                        case 302:
                        case 303:
                            h.a(i, this.c);
                            return;
                        default:
                            switch (i) {
                                case 401:
                                case 402:
                                case 403:
                                    break;
                                default:
                                    switch (i) {
                                        case 405:
                                        case 406:
                                        case 407:
                                        case 408:
                                        case IFAAFaceManager.STATUS_FACE_MOUTH_OCCLUSION /* 409 */:
                                        case IFAAFaceManager.STATUS_FACE_OFFSET_LEFT /* 410 */:
                                        case IFAAFaceManager.STATUS_FACE_OFFSET_RIGHT /* 411 */:
                                        case IFAAFaceManager.STATUS_FACE_OFFSET_TOP /* 412 */:
                                        case IFAAFaceManager.STATUS_FACE_OFFSET_BOTTOM /* 413 */:
                                        case IFAAFaceManager.STATUS_FACE_CAPTURE /* 414 */:
                                        case IFAAFaceManager.STATUS_FACE_NO_FACE /* 415 */:
                                        case 416:
                                            break;
                                        default:
                                            a.d("crashsdk", "Unknown async runnable: " + toString());
                                            if (!f23747a) {
                                                throw new AssertionError();
                                            }
                                            return;
                                    }
                            }
                            com.uc.crashsdk.e.a(this.b, this.c);
                            return;
                    }
            }
        }
    }

    public String toString() {
        return super.toString() + "@action_" + this.b;
    }
}
