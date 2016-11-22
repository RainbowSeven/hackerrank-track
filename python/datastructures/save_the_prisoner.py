"""Cyclic linked list solution of Save the Prisoner https://www.hackerrank.com/challenges/save-the-prisoner"""
T = input()  # number of test cases

class Node(object):
    def __init__(self, ID=None, next=None):
        self.ID = ID
        self.next = next

def get_start(node, ID):
    if node.ID is ID:
        return node
    return get_start(node.next, ID)

def distribute(node, num_sweets):
    num_sweets -= 1
    if not num_sweets:
        return node
    return distribute(node.next, num_sweets)

for i in range(T):
    N, M, S = raw_input().split()  # number of prisoners, number of sweets, prisoner id to start with

    head = Node(1)
    tmp = head
    for i in range(2, int(N)+1):
        N = Node(i)
        tmp.next = N
        tmp = tmp.next
    tmp.next = head

    start = get_start(head, int(S))

    last_recipient = distribute(start, int(M))

    print last_recipient.ID