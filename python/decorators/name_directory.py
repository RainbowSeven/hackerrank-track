import operator

directory = ['Mike Thomson 20 M', 'Robert Bustle 32 M', 'Andria Bustle 30 F']


def make_profile_into_list(func):
    def wraps(directory):
        return func([profile.split() for profile in directory])
    return wraps


def sort_profiles_by_age_asc(func):
    def wraps(directory):
        return func(sorted(directory, key=operator.itemgetter(2)))
    return wraps


def format_names_by_gender(func):
    def wraps(directory):
        names = [(
            'Mr. ' if profile[3] == 'M' else 'Ms. '
            ) + " ".join(profile[0:2]) for profile in directory]
        return func(names)
    return wraps


@make_profile_into_list
@sort_profiles_by_age_asc
@format_names_by_gender
def print_directory(directory):
    print "\n".join(directory)

print_directory(directory)
