lines = ['the difference between two civilizations', 'data engineering essentials', 'the moon and the sun']

def mapper(line):
    for word in line.split():
        yield word, 1

def reducer(key, values):
    count = sum(values)
    yield key, count

if __name__ == '__main__':
    for line in lines:
        for key, value in map(mapper, line):
            reducer(key, value)
