import sys
import hashlib

SIZE = 65536

md5 = hashlib.md5()

with open(sys.argv[1], "rb") as f:
    while True:
        data = f.read(SIZE)
        if not data:
            break
        md5.update(data)

print('md5 {0}'.format(md5.hexdigest()))