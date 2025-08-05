package tb;

import com.alibaba.security.realidentity.e2;
import com.alibaba.wireless.security.SecExceptionCode;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.taobao.android.layoutmanager.module.NavigationTabHelper;
import com.taobao.browser.utils.i;
import java.util.Arrays;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes2.dex */
public final class fge {

    /* renamed from: a  reason: collision with root package name */
    static final int f27922a;
    static final int[] b;
    protected int[] c;
    protected long[] d;
    protected boolean e;
    protected int f;
    protected int g;
    protected int h;

    static {
        kge.a(1869387104);
        int[] iArr = {5, 11, 23, 47, 97, 197, 397, 797, 1597, e2.c0, 6421, 12853, 25717, 51437, 102877, 205759, 411527, 823117, 1646237, 3292489, 6584983, 13169977, 26339969, 52679969, 105359939, 210719881, 421439783, 842879579, 1685759167, 433, 877, 1759, 3527, 7057, 14143, 28289, 56591, 113189, 226379, 452759, 905551, 1811107, 3622219, 7244441, 14488931, 28977863, 57955739, 115911563, 231823147, 463646329, 927292699, 1854585413, 953, SecExceptionCode.SEC_ERROR_GENERIC_AVMP_AVMPINIT_FAILED, 3821, 7643, 15287, 30577, 61169, 122347, 244703, 489407, 978821, 1957651, 3915341, 7830701, 15661423, 31322867, 62645741, 125291483, 250582987, 501165979, 1002331963, 2004663929, 1039, 2081, 4177, 8363, 16729, 33461, 66923, 133853, 267713, 535481, 1070981, 2141977, 4283963, 8567929, 17135863, 34271747, 68543509, 137087021, 274174111, 548348231, 1096696463, 31, 67, 137, Result.ALIPAY_GET_FP_INDEX_FAILED, 557, i.HIDDEN_FLOWBAR, 2237, 4481, 8963, 17929, 35863, 71741, 143483, 286973, 573953, 1147921, 2295859, 4591721, 9183457, 18366923, 36733847, 73467739, 146935499, 293871013, 587742049, 1175484103, SecExceptionCode.SEC_ERROR_DYN_STORE_UNKNOWN_ERROR, 1201, 2411, 4831, 9677, 19373, 38747, 77509, 155027, 310081, 620171, 1240361, 2480729, 4961459, 9922933, 19845871, 39691759, 79383533, 158767069, 317534141, 635068283, 1270136683, SecExceptionCode.SEC_ERROR_STA_DECRYPT_MISMATCH_KEY_DATA, 631, 1277, 2557, 5119, 10243, 20507, 41017, 82037, 164089, 328213, 656429, 1312867, 2625761, 5251529, 10503061, 21006137, 42012281, 84024581, 168049163, 336098327, 672196673, 1344393353, 3, 7, 17, 37, 79, 163, 331, 673, 1361, 2729, 5471, 10949, 21911, 43853, 87719, 175447, 350899, 701819, 1403641, 2807303, 5614657, 11229331, 22458671, 44917381, 89834777, 179669557, 359339171, 718678369, 1437356741, 43, 89, NavigationTabHelper.ALPHA_70_PERCENT, 359, IMediaPlayer.MEDIA_INFO_SWITCH_PATH_SYNC_FRAME_SUCCESS, 1439, 2879, 5779, 11579, 23159, 46327, 92657, 185323, 370661, 741337, 1482707, 2965421, 5930887, 11861791, 23723597, 47447201, 94894427, 189788857, 379577741, 759155483, 1518310967, 379, 761, 1523, 3049, 6101, 12203, 24407, 48817, 97649, 195311, 390647, 781301, 1562611, 3125257, 6250537, 12501169, 25002389, 50004791, 100009607, 200019221, 400038451, 800076929, 1600153859};
        b = iArr;
        Arrays.sort(iArr);
        int[] iArr2 = b;
        f27922a = iArr2[iArr2.length - 1];
    }

    public fge() {
        this.h = 18;
        this.g = 37;
        this.d = new long[37];
        this.c = new int[37];
    }

    public fge(long j, int i) {
        this.h = 18;
        this.d = new long[37];
        this.c = new int[37];
        this.e = true;
        long[] jArr = this.d;
        int length = (Integer.MAX_VALUE & ((int) ((j >>> 32) ^ j))) % jArr.length;
        jArr[length] = j;
        this.c[length] = i;
        this.g = 36;
        this.f = 1;
    }

    static int a(int i) {
        int i2 = f27922a;
        if (i >= i2) {
            return i2;
        }
        int binarySearch = Arrays.binarySearch(b, i);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        return b[binarySearch];
    }

    private void b(int i) {
        if (this.f > this.h) {
            i = a(i << 1);
        }
        long[] jArr = this.d;
        int length = jArr.length;
        int[] iArr = this.c;
        this.d = new long[i];
        this.c = new int[i];
        while (true) {
            int i2 = length - 1;
            if (length > 0) {
                long j = jArr[i2];
                if (j != 0) {
                    this.c[b(j)] = iArr[i2];
                }
                length = i2;
            } else {
                return;
            }
        }
    }

    public int a(long j) {
        long[] jArr = this.d;
        int i = Integer.MAX_VALUE & ((int) ((j >>> 32) ^ j));
        int length = i % jArr.length;
        long j2 = jArr[length];
        if (j2 == 0) {
            return -1;
        }
        if (j2 == j) {
            return this.c[length];
        }
        int length2 = jArr.length;
        int i2 = (i % (length2 - 2)) + 1;
        int i3 = length;
        do {
            i3 -= i2;
            if (i3 < 0) {
                i3 += length2;
            }
            long[] jArr2 = this.d;
            if (jArr2[i3] == 0) {
                return -1;
            }
            if (j == jArr2[i3]) {
                return this.c[i3];
            }
        } while (i3 != length);
        return -1;
    }

    public void a(long j, int i) {
        int i2;
        int i3 = Integer.MAX_VALUE & ((int) ((j >>> 32) ^ j));
        long[] jArr = this.d;
        int length = i3 % jArr.length;
        long j2 = jArr[length];
        boolean z = false;
        this.e = false;
        if (j2 == 0) {
            this.e = true;
            jArr[length] = j;
        } else {
            if (j2 == j) {
                i2 = -length;
            } else {
                int length2 = jArr.length;
                int i4 = (i3 % (length2 - 2)) + 1;
                int i5 = length;
                while (true) {
                    i5 -= i4;
                    if (i5 < 0) {
                        i5 += length2;
                    }
                    long[] jArr2 = this.d;
                    long j3 = jArr2[i5];
                    if (j3 != 0) {
                        if (j3 != j) {
                            if (i5 == length) {
                                break;
                            }
                        } else {
                            i2 = -i5;
                            break;
                        }
                    } else {
                        this.e = true;
                        jArr2[i5] = j;
                        break;
                    }
                }
                length = i5;
            }
            length = i2 - 1;
        }
        if (length < 0) {
            length = (-length) - 1;
        } else {
            z = true;
        }
        this.c[length] = i;
        if (z) {
            if (this.e) {
                this.g--;
            }
            int i6 = this.f + 1;
            this.f = i6;
            if (i6 <= this.h && this.g != 0) {
                return;
            }
            int length3 = this.d.length;
            if (this.f > this.h) {
                length3 = a(length3 << 1);
            }
            long[] jArr3 = this.d;
            int length4 = jArr3.length;
            int[] iArr = this.c;
            this.d = new long[length3];
            this.c = new int[length3];
            while (true) {
                int i7 = length4 - 1;
                if (length4 <= 0) {
                    int length5 = this.d.length;
                    this.h = Math.min(length5 - 1, (int) (length5 * 0.5f));
                    this.g = length5 - this.f;
                    return;
                }
                if (jArr3[i7] != 0) {
                    this.c[b(jArr3[i7])] = iArr[i7];
                }
                length4 = i7;
            }
        }
    }

    protected int b(long j) {
        int i;
        int i2 = Integer.MAX_VALUE & ((int) ((j >>> 32) ^ j));
        long[] jArr = this.d;
        int length = i2 % jArr.length;
        boolean z = jArr[length] != 0;
        this.e = false;
        if (!z) {
            this.e = true;
            this.d[length] = j;
            return length;
        }
        long[] jArr2 = this.d;
        if (jArr2[length] != j) {
            int length2 = jArr2.length;
            int i3 = (i2 % (length2 - 2)) + 1;
            int i4 = length;
            do {
                i4 -= i3;
                if (i4 < 0) {
                    i4 += length2;
                }
                if (!(this.d[i4] != 0)) {
                    this.e = true;
                    this.d[i4] = j;
                    return i4;
                } else if (this.d[i4] == j) {
                    i = -i4;
                }
            } while (i4 != length);
            throw new IllegalStateException("No free or removed slots available. Key set full?!!");
        }
        i = -length;
        return i - 1;
    }

    public int b(long j, int i) {
        int i2;
        int i3 = Integer.MAX_VALUE & ((int) ((j >>> 32) ^ j));
        long[] jArr = this.d;
        int length = i3 % jArr.length;
        long j2 = jArr[length];
        this.e = false;
        if (j2 == 0) {
            this.e = true;
            jArr[length] = j;
        } else {
            if (j2 == j) {
                i2 = -length;
            } else {
                int i4 = length;
                while (true) {
                    long[] jArr2 = this.d;
                    i4 -= (i3 % (jArr2.length - 2)) + 1;
                    if (i4 < 0) {
                        i4 += jArr2.length;
                    }
                    long[] jArr3 = this.d;
                    long j3 = jArr3[i4];
                    if (j3 != 0) {
                        if (j3 != j) {
                            if (i4 == length) {
                                break;
                            }
                        } else {
                            i2 = -i4;
                            break;
                        }
                    } else {
                        this.e = true;
                        jArr3[i4] = j;
                        break;
                    }
                }
                length = i4;
            }
            length = i2 - 1;
        }
        if (length < 0) {
            return this.c[(-length) - 1];
        }
        this.c[length] = i;
        if (this.e) {
            this.g--;
        }
        int i5 = this.f + 1;
        this.f = i5;
        if (i5 > this.h || this.g == 0) {
            b(this.d.length);
            int length2 = this.d.length;
            this.h = Math.min(length2 - 1, (int) (length2 * 0.5f));
            this.g = length2 - this.f;
        }
        return i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(riy.BLOCK_START_STR);
        long[] jArr = this.d;
        int[] iArr = this.c;
        int length = jArr.length;
        boolean z = true;
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                sb.append('}');
                return sb.toString();
            }
            if (jArr[i] != 0) {
                long j = jArr[i];
                int i2 = iArr[i];
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(j);
                sb.append('=');
                sb.append(i2);
            }
            length = i;
        }
    }
}
